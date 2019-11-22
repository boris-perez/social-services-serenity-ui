package com.dharbor.nexus.test.explanation;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.explanation.ExplanationConstant;
import com.dharbor.nexus.application.components.explanation.ExplanationCreateNew;
import com.dharbor.nexus.application.components.login.ConstantsLogin;
import com.dharbor.nexus.application.components.login.InsertCredentialsAndLogin;
import com.dharbor.nexus.test.AbstractTest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;

/**
 * @author Ivan Alban
 */
@WithTag("EXPLANATION")
public class ExplanationCreateTest extends AbstractTest {

    private Actor actor = Actor.named("boris");

    private OpenBrowser openBrowser;

    private ExplanationCreateNew explanationCreateNew;

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    @Before
    public void setup() {
        initializeActor1(actor);

        openBrowser = taskInstance(OpenBrowser.class);

        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);

        explanationCreateNew = taskInstance(ExplanationCreateNew.class);
        explanationCreateNew.setExplanationContent(ExplanationConstant.NEW_EXPLANATION);
    }

    @Test
    public void userLogin() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        then(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(explanationCreateNew);
    }
}
