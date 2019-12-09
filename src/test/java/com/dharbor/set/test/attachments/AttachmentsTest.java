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
import static org.hamcrest.Matchers.is;

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
    private AttachmentShowOptionsItem attachmentShowOptionsItem;
    private AttachmentSelectDocumentLibrary attachmentSelectDocumentLibrary;
    private AttachmentItemAttachExits attachmentItemAttachExits;
    private AttachmentFromDocumentLibraryExits attachmentFromDocumentLibraryExits;
    private AttachmentUploadDocumentExits attachmentUploadDocumentExits;
    private AttachmentViewOptionExits attachmentViewOptionExits;
    private AttachmentDeleteOptionExits attachmentDeleteOptionExits;
    private AttachmentEditOptionExits attachmentEditOptionExits;
    private AttachmentVersionOptionExits attachmentVersionOptionExits;
    private AttachmentDownloadOptionExits attachmentDownloadOptionExits;
    private AttachmentLucyAlert attachmentLucy;
    private AttachmentItemLibraryAttachExits attachmentItemLibraryAttachExits;
    private AttachmentUploadDocumentVersionExits attachmentUploadDocumentVersionExits;
    private AttachmentZoomInExits attachmentZoomInExits;
    private AttachmentZoomOutExits attachmentZoomOutExits;
    private AttachmentRotateLeftExits attachmentRotateLeftExits;
    private AttachmentRotateRightExits attachmentRotateRightExits;

    @Before
    public void setup() {
        fullScreen();
        initializeActor(actor);

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
        attachmentShowOptionsItem = taskInstance(AttachmentShowOptionsItem.class);
        attachmentSelectDocumentLibrary = taskInstance(AttachmentSelectDocumentLibrary.class);

        attachmentItemAttachExits = questionInstance(AttachmentItemAttachExits.class);
        attachmentFromDocumentLibraryExits = questionInstance(AttachmentFromDocumentLibraryExits.class);
        attachmentUploadDocumentExits = questionInstance(AttachmentUploadDocumentExits.class);
        attachmentViewOptionExits = questionInstance(AttachmentViewOptionExits.class);
        attachmentDeleteOptionExits = questionInstance(AttachmentDeleteOptionExits.class);
        attachmentEditOptionExits = questionInstance(AttachmentEditOptionExits.class);
        attachmentVersionOptionExits = questionInstance(AttachmentVersionOptionExits.class);
        attachmentDownloadOptionExits = questionInstance(AttachmentDownloadOptionExits.class);
        attachmentLucy = questionInstance(AttachmentLucyAlert.class);
        attachmentItemLibraryAttachExits = questionInstance(AttachmentItemLibraryAttachExits.class);
        attachmentUploadDocumentVersionExits = questionInstance(AttachmentUploadDocumentVersionExits.class);
        attachmentZoomInExits = questionInstance(AttachmentZoomInExits.class);
        attachmentZoomOutExits = questionInstance(AttachmentZoomOutExits.class);
        attachmentRotateLeftExits = questionInstance(AttachmentRotateLeftExits.class);
        attachmentRotateRightExits = questionInstance(AttachmentRotateRightExits.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
        attachmentUploadDocument.setDocumentTitle(AttachmentConstant.TITLE);
        attachmentUploadDocument.setDocumentDescription(AttachmentConstant.DESCRIPTION);
        attachmentUploadDocument.setUrl(AttachmentConstant.FILE_IMAGE);
        attachmentEditDocument.setDocumentTitle(AttachmentConstant.TITLE_EDIT);
        attachmentSearchFromDocumentLibrary.setValue(AttachmentConstant.TITLE);
        attachmentUploadVersionDocument.setUrl(AttachmentConstant.FILE_PDF);
        attachmentUploadVersionDocument.setDocumentTitle(AttachmentConstant.TITLE_VERSION);
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits)
        );
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
        then(actor).should(
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        and(actor)
                .wasAbleTo(attachmentShowOptionsItem);
        then(actor).should(
                seeThat(attachmentEditOptionExits));
        then(actor).
                attemptsTo(attachmentChangeToSensitive);
        then(actor).should(
                seeThat(attachmentLucy, is(AttachmentConstant.ALERT_EDIT)));
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        and(actor)
                .wasAbleTo(attachmentShowOptionsItem);
        then(actor).should(
                seeThat(attachmentDeleteOptionExits));
        then(actor).
                wasAbleTo(attachmentDeleteDocument);
        then(actor).should(
                seeThat(attachmentLucy, is(AttachmentConstant.ALERT_DELETE_YES)));
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        then(actor)
                .wasAbleTo(attachmentSelectDocumentLibrary);
        then(actor)
                .wasAbleTo(attachmentDeleteFromDocumentLibrary);
        then(actor).should(
                seeThat(attachmentLucy, is(AttachmentConstant.ALERT_DELETE_YES)));
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
        and(actor)
                .wasAbleTo(attachmentShowOptionsItem);
        then(actor).should(
                seeThat(attachmentDownloadOptionExits));
        then(actor).
                wasAbleTo(attachmentDownloadDocument);
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        then(actor)
                .wasAbleTo(attachmentSelectDocumentLibrary);
        then(actor).
                wasAbleTo(attachmentDownloadFromDocumentLibrary);
        then(actor).should(
                seeThat(attachmentItemLibraryAttachExits)
        );
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        and(actor)
                .wasAbleTo(attachmentShowOptionsItem);
        then(actor).should(
                seeThat(attachmentEditOptionExits));
        then(actor).
                wasAbleTo(attachmentEditDocument);
        then(actor).should(
                seeThat(attachmentLucy, is(AttachmentConstant.ALERT_EDIT))
        );
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        then(actor)
                .wasAbleTo(attachmentSelectDocumentLibrary);
        then(actor).
                wasAbleTo(attachmentSearchFromDocumentLibrary);
        then(actor).should(
                seeThat(attachmentItemLibraryAttachExits)
        );
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        then(actor)
                .wasAbleTo(attachmentSelectDocumentLibrary);
        then(actor).
                wasAbleTo(attachmentSelectFromDocumentLibrary);
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        and(actor)
                .wasAbleTo(attachmentShowOptionsItem);
        then(actor).should(
                seeThat(attachmentVersionOptionExits));
        then(actor)
                .wasAbleTo(attachmentUploadVersionDocument);
        then(actor).should(
                seeThat(attachmentUploadDocumentVersionExits));
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        and(actor)
                .wasAbleTo(attachmentShowOptionsItem);
        then(actor).should(
                seeThat(attachmentVersionOptionExits));
        and(actor)
                .attemptsTo(attachmentUploadVersionDocument);
        then(actor)
                .attemptsTo(attachmentSelectVersionDocument);
        then(actor).should(
                seeThat(attachmentLucy, is(AttachmentConstant.ALERT_UPDATE_VERSION))
        );
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        then(actor)
                .wasAbleTo(attachmentSelectDocumentLibrary);
        then(actor)
                .wasAbleTo(attachmentVersionFromDocumentLibrary);
        then(actor).should(
                seeThat(attachmentUploadDocumentVersionExits));
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
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        and(actor)
                .wasAbleTo(attachmentShowOptionsItem);
        then(actor).should(
                seeThat(attachmentViewOptionExits));
        then(actor)
                .wasAbleTo(attachmentViewDocument);
        then(actor).should(
                seeThat(attachmentZoomInExits),
                seeThat(attachmentZoomOutExits),
                seeThat(attachmentRotateLeftExits),
                seeThat(attachmentRotateRightExits));
    }

    @Test
    @WithTag("View document from document Library")
    public void verify_that_the_user_can_select_view_option_from_library() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(attachmentOption);
        and(actor)
                .attemptsTo(attachmentUploadDocument);
        then(actor).should(
                seeThat(attachmentItemAttachExits),
                seeThat(attachmentFromDocumentLibraryExits),
                seeThat(attachmentUploadDocumentExits));
        then(actor)
                .wasAbleTo(attachmentSelectDocumentLibrary);
        then(actor)
                .wasAbleTo(attachmentViewFromDocumentLibrary);
        then(actor).should(
                seeThat(attachmentZoomInExits),
                seeThat(attachmentZoomOutExits),
                seeThat(attachmentRotateLeftExits),
                seeThat(attachmentRotateRightExits));
    }
}
