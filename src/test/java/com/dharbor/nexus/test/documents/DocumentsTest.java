package com.dharbor.nexus.test.documents;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.documents.DocumentCancelUploadDocument;
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

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    private DocumentCancelUploadDocument documentCancelUploadDocument;


    @Before
    public void setup() {
        initializeActor2(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        documentUploadDocument = taskInstance(DocumentUploadDocument.class);
        documentCancelUploadDocument = taskInstance(DocumentCancelUploadDocument.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
        documentUploadDocument.setDocumentTitle(DocumentsConstant.TITLE);
        documentUploadDocument.setDocumentDescription(DocumentsConstant.DESCRIPTION);


    }

    @Test
    @WithTag("Upload Document")
    public void verify_that_the_user_can_cancel_upload_to_Document_Library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(documentCancelUploadDocument);
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
    }
}
