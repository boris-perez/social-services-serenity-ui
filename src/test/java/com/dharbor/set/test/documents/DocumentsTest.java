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
import static org.hamcrest.Matchers.is;

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
    private DocumentViewDocument documentViewDocument;
    private DocumentChangeToSensitive documentChangeToSensitive;
    private DocumentUploadVersionDocument documentUploadVersionDocument;
    private DocumentSelectVersionDocument documentSelectVersionDocument;
    private DocumentTitlePanel documentTitlePanel;
    private DocumentEditOptionsExits documentEditOptionsExits;
    private DocumentDeleteOptionsExits documentDeleteOptionsExits;
    private DocumentVersionOptionsExits documentVersionOptionsExits;
    private DocumentViewOptionsExits documentViewOptionsExits;
    private DocumentDownloadOptionsExits documentDownloadOptionsExits;
    private DocumentDeleteDocumentYes documentDeleteDocumentYes;
    private DocumentDeleteYesOptionsExits documentDeleteYesOptionsExits;
    private DocumentDeleteNoOptionsExits documentDeleteNoOptionsExits;
    private DocumentEditDocumentSave documentEditDocumentSave;
    private DocumentEditSaveExits documentEditSaveExits;
    private DocumentEditTitleExits documentEditTitleExits;
    private DocumentZoomInExits documentZoomInExits;
    private DocumentZoomOutExits documentZoomOutExits;
    private DocumentRotateLeftExits documentRotateLeftExits;
    private DocumentRotateRightExits documentRotateRightExits;
    private DocumentVersionExits documentVersionExits;
    private DocumentNewVersionExits documentNewVersionExits;


    @Before
    public void setup() {

        fullScreen();
        initializeActor(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        documentUploadDocument = taskInstance(DocumentUploadDocument.class);
        documentCancelUploadDocument = taskInstance(DocumentCancelUploadDocument.class);
        documentDeleteDocument = taskInstance(DocumentDeleteDocument.class);
        documentDownloadDocument = taskInstance(DocumentDownloadDocument.class);
        documentEditDocument = taskInstance(DocumentEditDocument.class);
        documentViewDocument = taskInstance(DocumentViewDocument.class);
        documentChangeToSensitive = taskInstance(DocumentChangeToSensitive.class);
        documentUploadVersionDocument = taskInstance(DocumentUploadVersionDocument.class);
        documentSelectVersionDocument = taskInstance(DocumentSelectVersionDocument.class);
        documentDeleteDocumentYes = taskInstance(DocumentDeleteDocumentYes.class);
        documentEditDocumentSave = taskInstance(DocumentEditDocumentSave.class);

        documentTitlePanel = questionInstance(DocumentTitlePanel.class);
        documentEditOptionsExits = questionInstance(DocumentEditOptionsExits.class);
        documentDeleteOptionsExits = questionInstance(DocumentDeleteOptionsExits.class);
        documentVersionOptionsExits = questionInstance(DocumentVersionOptionsExits.class);
        documentViewOptionsExits = questionInstance(DocumentViewOptionsExits.class);
        documentDownloadOptionsExits = questionInstance(DocumentDownloadOptionsExits.class);
        documentDeleteNoOptionsExits = questionInstance(DocumentDeleteNoOptionsExits.class);
        documentDeleteYesOptionsExits = questionInstance(DocumentDeleteYesOptionsExits.class);
        documentEditSaveExits = questionInstance(DocumentEditSaveExits.class);
        documentEditTitleExits = questionInstance(DocumentEditTitleExits.class);
        documentZoomInExits = questionInstance(DocumentZoomInExits.class);
        documentZoomOutExits = questionInstance(DocumentZoomOutExits.class);
        documentRotateLeftExits = questionInstance(DocumentRotateLeftExits.class);
        documentRotateRightExits = questionInstance(DocumentRotateRightExits.class);
        documentVersionExits = questionInstance(DocumentVersionExits.class);
        documentNewVersionExits = questionInstance(DocumentNewVersionExits.class);

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
        then(actor).should(
                seeThat(documentTitlePanel, is(DocumentsConstant.PANEL_NAME)));
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
        then(actor).should(
                seeThat(documentDeleteOptionsExits),
                seeThat(documentDownloadOptionsExits),
                seeThat(documentEditOptionsExits),
                seeThat(documentVersionOptionsExits),
                seeThat(documentViewOptionsExits));
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
        then(actor).should(
                seeThat(documentDeleteYesOptionsExits),
                seeThat(documentDeleteNoOptionsExits));
        then(actor)
                .wasAbleTo(documentDeleteDocumentYes);
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
        then(actor).should(
                seeThat(documentDeleteOptionsExits),
                seeThat(documentDownloadOptionsExits),
                seeThat(documentEditOptionsExits),
                seeThat(documentVersionOptionsExits),
                seeThat(documentViewOptionsExits)
        );
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
        and(actor)
                .attemptsTo(documentEditDocument);
        then(actor).should(
                seeThat(documentEditTitleExits),
                seeThat(documentEditSaveExits));
        and(actor)
                .attemptsTo(documentEditDocumentSave);
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
        then(actor).should(
                seeThat(documentEditTitleExits),
                seeThat(documentEditSaveExits));
        and(actor)
                .attemptsTo(documentEditDocumentSave);
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
        then(actor).should(
                seeThat(documentRotateLeftExits),
                seeThat(documentRotateRightExits),
                seeThat(documentZoomInExits),
                seeThat(documentZoomOutExits)
        );
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
        and(actor)
                .attemptsTo(documentUploadVersionDocument);
        then(actor).should(
                seeThat(documentVersionExits)
        );

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
        then(actor).should(
                seeThat(documentNewVersionExits)
        );
    }
}
