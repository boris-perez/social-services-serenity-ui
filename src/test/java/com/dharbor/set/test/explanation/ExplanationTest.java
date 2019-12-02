package com.dharbor.set.test.explanation;

import com.dharbor.set.application.components.browser.OpenBrowser;
import com.dharbor.set.application.components.explanation.*;
import com.dharbor.set.application.components.login.ConstantsLogin;
import com.dharbor.set.application.components.login.InsertCredentialsAndLogin;
import com.dharbor.set.test.AbstractTest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

/**
 * @author Boris Perez
 */
@WithTag("EXPLANATION")
public class ExplanationTest extends AbstractTest {

    private Actor actor = Actor.named("boris");

    private OpenBrowser openBrowser;

    private ExplanationCreateNew explanationCreateNew;

    private ExplanationDelete explanationDelete;

    private ExplanationEdit explanationEdit;

    private ExplanationNavigate explanationNavigate;

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    private ExplanationLucyAlert explanationLucyAlert;

    private ExplanationDeletedExists explanationDeleteExists;

    private ExplanationEditExists explanationEditExists;

    private ExplanationNewIconExists explanationNewIconExists;

    private ExplanationSelectExplanationOption explanationSelectExplanationOption;

    private ExplanationFillExplanation explanationFillExplanation;

    @Before
    public void setup() {
        initializeActor1(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        explanationDelete = taskInstance(ExplanationDelete.class);
        explanationEdit = taskInstance(ExplanationEdit.class);
        explanationNavigate = taskInstance(ExplanationNavigate.class);
        explanationLucyAlert = questionInstance(ExplanationLucyAlert.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        explanationDeleteExists = questionInstance(ExplanationDeletedExists.class);
        explanationEditExists = questionInstance(ExplanationEditExists.class);
        explanationCreateNew = taskInstance(ExplanationCreateNew.class);
        explanationFillExplanation = taskInstance(ExplanationFillExplanation.class);
        explanationSelectExplanationOption = taskInstance(ExplanationSelectExplanationOption.class);
        explanationNewIconExists = questionInstance(ExplanationNewIconExists.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
        explanationFillExplanation.setExplanationContent(ExplanationConstant.NEW_EXPLANATION);
        explanationNavigate.setExplanationContent(ExplanationConstant.NEW_EXPLANATION);
        explanationEdit.setExplanationContent(ExplanationConstant.EDIT_EXPLANATION);
    }

    @Test
    @WithTag("Create Explanation")
    public void verify_that_the_user_can_create_new_explanation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        when(actor)
                .attemptsTo(explanationSelectExplanationOption);
        if (explanationNewIconExists.answeredBy(actor)) {
            then(actor)
                    .attemptsTo(explanationCreateNew);
        }
        then(actor)
                .attemptsTo(explanationFillExplanation);
        then(actor).should(
                seeThat(explanationLucyAlert, is(ExplanationConstant.CREATE_EXPLANATION))
        );
    }

    @Test
    @WithTag("Delete Explanation")
    public void verify_that_the_user_can_delete_an_explanation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        when(actor)
                .attemptsTo(explanationSelectExplanationOption);
        if (explanationNewIconExists.answeredBy(actor)) {
            then(actor)
                    .attemptsTo(explanationCreateNew);
        }
        then(actor)
                .attemptsTo(explanationFillExplanation);
        then(actor)
                .attemptsTo(explanationDelete);
        then(actor).should(
                seeThat(explanationLucyAlert, is(ExplanationConstant.REMOVE_EXPLANATION))
        );
    }

    @Test
    @WithTag("Navigate Between Cards")
    public void verify_that_the_user_can_navigate_between_cards() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        when(actor)
                .attemptsTo(explanationSelectExplanationOption);
        if (explanationNewIconExists.answeredBy(actor)) {
            then(actor)
                    .attemptsTo(explanationCreateNew);
        }
        then(actor)
                .attemptsTo(explanationFillExplanation);
        then(actor)
                .attemptsTo((explanationNavigate));
        then(actor).should(
                seeThat(explanationDeleteExists),
                seeThat(explanationEditExists)
        );
    }

    @Test
    @WithTag("Edit Explanation")
    public void verify_that_the_user_can_edit_an_explanation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        when(actor)
                .attemptsTo(explanationSelectExplanationOption);
        if (explanationNewIconExists.answeredBy(actor)) {
            then(actor)
                    .attemptsTo(explanationCreateNew);
        }
        then(actor)
                .attemptsTo(explanationFillExplanation);
        and(actor)
                .attemptsTo(explanationEdit);
        then(actor).should(
                seeThat(explanationLucyAlert, is(ExplanationConstant.UPDATE_EXPLANATION))
        );
    }
}
