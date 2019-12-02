package com.dharbor.set.test.attachments;

import com.dharbor.set.application.components.attachments.*;
import com.dharbor.set.application.components.browser.OpenBrowser;
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
@WithTag("ATTACHMENT")
public class AttachmentsTest extends AbstractTest {

    private Actor actor = Actor.named("boris");

    private OpenBrowser openBrowser;

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    private AttachmentOption attachmentOption;

    private AttachmentUploadDocument attachmentUploadDocument;

    private AttachmentCancelUploadDocument attachmentCancel;

    private AttachmentChangeToSensitive attachmentChangeToSensitive;

    private AttachmentSelectFromDocumentLibrary attachmentSelectFromDocumentLibrary;

    private AttachmentDeleteDocument attachmentDeleteDocument;

    private AttachmentDeleteFromDocumentLibrary attachmentDeleteFromDocumentLibrary;

    private AttachmentDownloadDocument attachmentDownloadDocument;

    private AttachmentDownloadFromDocumentLibrary attachmentDownloadFromDocumentLibrary;

    private AttachmentEditDocument attachmentEditDocument;

    private AttachmentSelectVersionDocument attachmentSelectVersionDocument;

    private AttachmentUploadVersionDocument attachmentUploadVersionDocument;

    private AttachmentVersionFromDocumentLibrary attachmentVersionFromDocumentLibrary;

    private AttachmentViewDocument attachmentViewDocument;

    private AttachmentViewFromDocumentLibrary attachmentViewFromDocumentLibrary;

    private AttachmentSearchFromDocumentLibrary attachmentSearchFromDocumentLibrary;

    @Before
    public void setup() {
        initializeActor3(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        attachmentOption = taskInstance(AttachmentOption.class);
        attachmentUploadDocument = taskInstance(AttachmentUploadDocument.class);
        attachmentSelectFromDocumentLibrary = taskInstance(AttachmentSelectFromDocumentLibrary.class);
        attachmentDeleteDocument = taskInstance(AttachmentDeleteDocument.class);
        attachmentDeleteFromDocumentLibrary = taskInstance(AttachmentDeleteFromDocumentLibrary.class);
        attachmentDownloadDocument = taskInstance(AttachmentDownloadDocument.class);
        attachmentDownloadFromDocumentLibrary = taskInstance(AttachmentDownloadFromDocumentLibrary.class);
        attachmentEditDocument = taskInstance(AttachmentEditDocument.class);
        attachmentSelectVersionDocument = taskInstance(AttachmentSelectVersionDocument.class);
        attachmentUploadVersionDocument = taskInstance(AttachmentUploadVersionDocument.class);
        attachmentVersionFromDocumentLibrary = taskInstance(AttachmentVersionFromDocumentLibrary.class);
        attachmentViewDocument = taskInstance(AttachmentViewDocument.class);
        attachmentViewFromDocumentLibrary = taskInstance(AttachmentViewFromDocumentLibrary.class);
        attachmentSearchFromDocumentLibrary = taskInstance(AttachmentSearchFromDocumentLibrary.class);
        attachmentCancel = taskInstance(AttachmentCancelUploadDocument.class);
        attachmentChangeToSensitive = taskInstance(AttachmentChangeToSensitive.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
        attachmentUploadDocument.setDocumentTitle(AttachmentConstant.TITLE);
        attachmentUploadDocument.setDocumentDescription(AttachmentConstant.DESCRIPTION);
        attachmentUploadDocument.setUrl(AttachmentConstant.FILE_IMAGE);
        attachmentEditDocument.setDocumentTitle(AttachmentConstant.TITLE_EDIT);
        attachmentSearchFromDocumentLibrary.setValue(AttachmentConstant.TITLE);
        attachmentUploadVersionDocument.setDocumentDescription(AttachmentConstant.DESCRIPTION);
        attachmentUploadVersionDocument.setDocumentTitle(AttachmentConstant.TITLE_VERSION);
        attachmentUploadVersionDocument.setDocumentDescription(AttachmentConstant.FILE_PDF);

    }

    @Test
    @WithTag("Upload Document")
    public void verify_that_the_user_can_upload_document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        then(actor)
                .attemptsTo(attachmentUploadDocument);
    }

    @Test
    @WithTag("Cancel upload Document")
    public void verify_that_the_user_can_cancel_the_upload_file() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        then(actor)
                .attemptsTo(attachmentCancel);
    }

    @Test
    @WithTag("Change to sensitive")
    public void verify_that_the_user_can_change_to_sensitive() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .wasAbleTo(attachmentUploadDocument);
        then(actor).
                attemptsTo(attachmentChangeToSensitive);
    }

    @Test
    @WithTag("Delete document")
    public void verify_that_the_user_can_delete_a_document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .wasAbleTo(attachmentUploadDocument);
        then(actor).
                wasAbleTo(attachmentDeleteDocument);
    }

    @Test
    @WithTag("Delete document from library")
    public void verify_that_the_user_can_delete_a_document_from_library() {
        givenThat(actor)
                .wasAbleTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        then(actor)
                .wasAbleTo(attachmentUploadDocument);
        then(actor).
                wasAbleTo(attachmentDeleteFromDocumentLibrary);
    }

    @Test
    @WithTag("Download document")
    public void verify_that_the_user_can_download_a_document() {
        givenThat(actor)
                .wasAbleTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(attachmentOption);
        then(actor)
                .wasAbleTo(attachmentUploadDocument);
        then(actor).
                wasAbleTo(attachmentDownloadDocument);
    }

    @Test
    @WithTag("Download document from library")
    public void verify_that_the_user_can_download_a_document_from_library() {
        givenThat(actor)
                .wasAbleTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .wasAbleTo(attachmentUploadDocument);
        then(actor).
                wasAbleTo(attachmentDownloadFromDocumentLibrary);
    }

    @Test
    @WithTag("Edit document")
    public void verify_that_the_user_can_edit_a_document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .wasAbleTo(attachmentUploadDocument);
        then(actor).
                wasAbleTo(attachmentEditDocument);
    }

    @Test
    @WithTag("Search document from library")
    public void verify_that_the_user_can_search_a_document_from_library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .attemptsTo(attachmentUploadDocument);
        then(actor).
                wasAbleTo(attachmentSearchFromDocumentLibrary);
    }

    @Test
    @WithTag("Select from library")
    public void verify_that_the_user_can_select_a_document_from_library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .attemptsTo(attachmentUploadDocument);
        then(actor).
                wasAbleTo(attachmentSelectFromDocumentLibrary);
    }

    @Test
    @WithTag("Upload a version")
    public void verify_that_the_user_can_upload_a_version() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        and(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .attemptsTo(attachmentUploadDocument);
        then(actor)
                .attemptsTo(attachmentUploadVersionDocument);
    }

    @Test
    @WithTag("Select a version")
    public void verify_that_the_user_can_select_a_version() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .attemptsTo(attachmentUploadDocument);
        and(actor)
                .attemptsTo(attachmentUploadVersionDocument);
        then(actor)
                .attemptsTo(attachmentSelectVersionDocument);
    }

    @Test
    @WithTag("Update version from documentLibrary")
    public void verify_that_the_user_can_select_a_version_from_library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .attemptsTo(attachmentUploadDocument);
        then(actor)
                .wasAbleTo(attachmentVersionFromDocumentLibrary);
    }

    @Test
    @WithTag("View document")
    public void verify_that_the_user_can_select_view_option() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(attachmentOption);
        and(actor)
                .wasAbleTo(attachmentUploadDocument);
        then(actor)
                .wasAbleTo(attachmentViewDocument);
    }

    @Test
    @WithTag("View document from documentLibrary")
    public void verify_that_the_user_can_select_view_option_from_library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(attachmentOption);
        and(actor)
                .attemptsTo(attachmentUploadDocument);
        then(actor)
                .wasAbleTo(attachmentViewFromDocumentLibrary);
    }
}
