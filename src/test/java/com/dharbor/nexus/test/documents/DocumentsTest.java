package com.dharbor.nexus.test.documents;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.documents.DocumentUploadDocument;
import com.dharbor.nexus.application.components.documents.DocumentsConstant;
import com.dharbor.nexus.application.components.explanation.*;
import com.dharbor.nexus.application.components.login.ConstantsLogin;
import com.dharbor.nexus.application.components.login.InsertCredentialsAndLogin;
import com.dharbor.nexus.test.AbstractTest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

/**
 * @author Boris Perez
 */
@WithTag("DOCUMENTS")
public class DocumentsTest extends AbstractTest {

    private Actor actor = Actor.named("boris");

    private OpenBrowser openBrowser;

    private DocumentUploadDocument documentUploadDocument;

    private ExplanationDelete explanationDelete;

    private ExplanationEdit explanationEdit;

    private ExplanationNavigate explanationNavigate;

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    private ExplanationLucyAlert explanationLucyAlert;

    private ExplanationDeletedExists explanationDeleteExists;

    private ExplanationEditExists explanationEditExists;

    @Before
    public void setup() {
        initializeActor2(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        documentUploadDocument = taskInstance(DocumentUploadDocument.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
        documentUploadDocument.setDocumentDescription(DocumentsConstant.TITLE);
        documentUploadDocument.setDocumentTitle(DocumentsConstant.DESCRIPTION);
       // documentUploadDocument.setFile(DocumentsConstant.FILE_IMAGE);

    }

    @Test
    @WithTag("Upload Document")
    public void verify_that_the_user_can_upload_to_Document_Library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(documentUploadDocument);
//        then(actor).should(
//                seeThat(explanationLucyAlert, is(ExplanationConstant.CREATE_EXPLANATION))
    }

//    @Test
//    @WithTag("Delete Explanation")
//    public void verify_that_the_user_can_delete_an_explanation() {
//        givenThat(actor)
//                .attemptsTo(openBrowser);
//        when(actor)
//                .attemptsTo(insertCredentialsAndLogin);
//        and(actor)
//                .attemptsTo(explanationCreateNew);
//        then(actor)
//                .attemptsTo(explanationDelete);
//        then(actor).should(
//                seeThat(explanationLucyAlert, is(ExplanationConstant.REMOVE_EXPLANATION))
//        );
//    }
//
//    @Test
//    @WithTag("Navigate Between Cards")
//    public void verify_that_the_user_can_navigate_between_cards() {
//        givenThat(actor)
//                .attemptsTo(openBrowser);
//        when(actor)
//                .attemptsTo(insertCredentialsAndLogin);
//        then(actor)
//                .attemptsTo((explanationNavigate));
//        then(actor).should(
//                seeThat(explanationDeleteExists),
//                seeThat(explanationEditExists)
//        );
//    }
//
//    @Test
//    @WithTag("Edit Explanation")
//    public void verify_that_the_user_can_edit_an_explanation() {
//        givenThat(actor)
//                .attemptsTo(openBrowser);
//        when(actor)
//                .attemptsTo(insertCredentialsAndLogin);
//        and(actor)
//                .attemptsTo(explanationCreateNew);
//        and(actor)
//                .attemptsTo(explanationEdit);
//        then(actor).should(
//                seeThat(explanationLucyAlert, is(ExplanationConstant.UPDATE_EXPLANATION))
//        );
//    }
}
