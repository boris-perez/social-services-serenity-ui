package com.dharbor.set.test.documents;

import com.dharbor.set.application.components.browser.OpenBrowser;
import com.dharbor.set.application.components.documents.*;
import com.dharbor.set.application.components.login.ConstantsLogin;
import com.dharbor.set.application.components.login.InsertCredentialsAndLogin;
import com.dharbor.set.test.AbstractTest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

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

    private DocumentDeleteDocument documentDeleteDocument;

    private DocumentDownloadDocument documentDownloadDocument;

    private DocumentEditDocument documentEditDocument;

    private DocumentPaginationDocument documentPaginationDocument;

    private DocumentViewDocument documentViewDocument;

    private DocumentChangeToSensitive documentChangeToSensitive;

    private DocumentUploadVersionDocument documentUploadVersionDocument;

    private DocumentSelectVersionDocument documentSelectVersionDocument;

    @Before
    public void setup() {
        initializeActor2(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        documentUploadDocument = taskInstance(DocumentUploadDocument.class);
        documentCancelUploadDocument = taskInstance(DocumentCancelUploadDocument.class);
        documentDeleteDocument = taskInstance(DocumentDeleteDocument.class);
        documentDownloadDocument = taskInstance(DocumentDownloadDocument.class);
        documentEditDocument = taskInstance(DocumentEditDocument.class);
        documentPaginationDocument = taskInstance(DocumentPaginationDocument.class);
        documentViewDocument = taskInstance(DocumentViewDocument.class);
        documentChangeToSensitive = taskInstance(DocumentChangeToSensitive.class);
        documentUploadVersionDocument = taskInstance(DocumentUploadVersionDocument.class);
        documentSelectVersionDocument = taskInstance(DocumentSelectVersionDocument.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
        documentUploadDocument.setDocumentTitle(DocumentsConstant.TITLE);
        documentUploadDocument.setDocumentDescription(DocumentsConstant.DESCRIPTION);
        documentUploadDocument.setUrl(DocumentsConstant.FILE_IMAGE);
        documentEditDocument.setDocumentTitle(DocumentsConstant.TITLE_EDIT);
        documentUploadVersionDocument.setDocumentDescription(DocumentsConstant.TITLE_VERSION);
        documentUploadVersionDocument.setDocumentTitle(DocumentsConstant.DESCRIPTION);
        documentUploadVersionDocument.setUrl(DocumentsConstant.FILE_DOC);

    }

    @Test
    @WithTag("Cancel upload Document")
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

    @Test
    @WithTag("Delete Document")
    public void verify_that_the_user_can_delete_a_Document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentDeleteDocument);
    }

    @Test
    @WithTag("Download Document")
    public void verify_that_the_user_can_download_a_Document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentDownloadDocument);
    }

    @Test
    @WithTag("Edit Document")
    public void verify_that_the_user_can_edit_a_Document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentEditDocument);
    }

    @Test
    @WithTag("Change to sensitive")
    public void verify_that_the_user_change_to_sensitive() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentChangeToSensitive);
    }

    @Test
    @WithTag("View Document")
    public void verify_that_the_user_can_view_a_Document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentViewDocument);
    }

    @Test
    @WithTag("Pagination Document Library")
    public void verify_that_the_user_can_chang_the_pagination_Document_Library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentPaginationDocument);
    }

    @Test
    @WithTag("Upload version")
    public void verify_that_the_user_can_upload_new_version() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentUploadVersionDocument);
    }


    @Test
    @WithTag("Select version")
    public void verify_that_the_user_can_select_new_version() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(documentUploadDocument);
        then(actor)
                .attemptsTo(documentUploadVersionDocument);
        then(actor)
                .attemptsTo(documentSelectVersionDocument);
    }
}
