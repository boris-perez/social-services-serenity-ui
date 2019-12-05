package com.dharbor.set.application.components.attachments;

import com.dharbor.set.application.framework.context.PrototypeScope;
import lombok.Getter;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.annotation.PostConstruct;
import java.nio.file.Paths;

/**
 * @author Boris Perez
 */
@PrototypeScope
class AttachmentComponent {

    @Getter
    private Target attachmentFirstField;

    @Getter
    private Target attachmentIcon;

    @Getter
    private Target attachmentUploadDocument;

    @Getter
    private Target attachmentAddDocumentLibrary;

    @Getter
    private Target attachmentUpload;

    @Getter
    private Target attachmentBack;

    @Getter
    private Target attachmentSearch;

    @Getter
    private Target attachmentSearchIcon;

    @Getter
    private Target attachmentEdit;

    @Getter
    private Target attachmentDelete;

    @Getter
    private Target attachmentDownload;

    @Getter
    private Target attachmentVersion;

    @Getter
    private Target attachmentView;

    @Getter
    private Target attachmentSelectFromLibrary;

    @Getter
    private Target attachmentDeleteFromLibrary;

    @Getter
    private Target attachmentDownloandFromLibrary;

    @Getter
    private Target attachmentVersionFromLibrary;

    @Getter
    private Target attachmentViewFromLibrary;

    @Getter
    private Target attachmentDeleteYes;

    @Getter
    private Target attachmentDeleteNo;

    @Getter
    private Target attachmentUploadVersion;

    @Getter
    private Target attachmentInputTitle;

    @Getter
    private Target attachmentInputDescription;

    @Getter
    private Target attachmentInputFile;

    @Getter
    private Target attachmentItem;

    @Getter
    private Target attachmentSwith;

    @Getter
    private Target attachmentCancel;

    @Getter
    private Target attachmentSave;

    @Getter
    private Target attachmentViewZoomIn;

    @Getter
    private Target attachmentViewZoomOut;

    @Getter
    private Target attachmentViewRotateLeft;

    @Getter
    private Target attachmentViewRotateRight;

    @Getter
    private Target attachmentViewClose;

    @Getter
    private Target attachmentSelectNo;

    @Getter
    private Target attachmentSelectYes;

    @Getter
    private Target attachmentAlertClose;

    @Getter
    private Target attachmentDocumentName;

    @Getter
    private Target attachmentAlertContent;

    @Getter
    private Target attachmentDropSection;

    @Getter
    private Target attachmentSelectVersionOption;

    @Getter
    private Target attachmentSelectVersion;

    @Getter
    private Target attachmentItemLibrary;

    Performable pushAttachmentFirstField() {
        return Click.on(attachmentFirstField);
    }

    Performable pushAttachmentIcon() {
        return Click.on(attachmentIcon);
    }

    Performable pushAttachmentUploadDocument() {
        return Click.on(attachmentUploadDocument);
    }

    Performable pushAttachmentAddDocumentLibrary() {
        return Click.on(attachmentAddDocumentLibrary);
    }

    Performable pushAttachmentBack() {
        return Click.on(attachmentBack);
    }

    Performable pushAttachmentUpload() {
        return Click.on(attachmentUpload);
    }

    Performable pushAttachmentSelectVersionOption() {
        return Click.on(attachmentSelectVersionOption);
    }

    Performable pushAttachmentSelectVersion() {
        return Click.on(attachmentSelectVersion);
    }

    Performable pushAttachmentSearchIcon() {
        return Click.on(attachmentSearchIcon);
    }

    Performable pushAttachmentEdit() {
        return Click.on(attachmentEdit);
    }

    Performable pushAttachmentDelete() {
        return Click.on(attachmentDelete);
    }

    Performable pushAttachmentDownload() {
        return Click.on(attachmentDownload);
    }

    Performable pushAttachmentVersion() {
        return Click.on(attachmentVersion);
    }

    Performable pushAttachmentView() {
        return Click.on(attachmentView);
    }

    Performable pushAttachmentSelectFromLibrary() {
        return Click.on(attachmentSelectFromLibrary);
    }

    Performable pushAttachmentDeleteFromLibrary() {
        return Click.on(attachmentDeleteFromLibrary);
    }

    Performable pushAttachmentDownloadLibrary() {
        return Click.on(attachmentDownloandFromLibrary);
    }

    Performable pushAttachmentVersionFromLibrary() {
        return Click.on(attachmentVersionFromLibrary);
    }

    Performable pushAttachmentViewFromLibrary() {
        return Click.on(attachmentViewFromLibrary);
    }

    Performable pushAttachmentDeleteYes() {
        return Click.on(attachmentDeleteYes);
    }

    Performable pushAttachmentDeleteNo() {
        return Click.on(attachmentDeleteNo);
    }

    Performable pushAttachmentUploadVersion() {
        return Click.on(attachmentUploadVersion);
    }

    Performable enterAttachmentInputTitle(String value) {
        return Enter.theValue(value).into(attachmentInputTitle);
    }

    Performable enterAttachmentInputDescription(String value) {
        return Enter.theValue(value).into(attachmentInputDescription);
    }

    Performable enterAttachmentInputFile(String value) {
        return Upload.theFile(Paths.get(value)).to(attachmentInputFile);
    }

    Performable enterAttachmentSearch(String value) {
        return Enter.theValue(value).into(attachmentSearch);
    }

    Performable pushAttachmentItem() {
        return Click.on(attachmentItem);
    }

    Performable pushAttachmentSwith() {
        return Click.on(attachmentSwith);
    }

    Performable pushAttachmentCancel() {
        return Click.on(attachmentCancel);
    }

    Performable pushAttachmentSave() {
        return Click.on(attachmentSave);
    }

    Performable pushAttachmentViewZoomIn() {
        return Click.on(attachmentViewZoomIn);
    }

    Performable pushAttachmentViewZoomOut() {
        return Click.on(attachmentViewZoomOut);
    }

    Performable pushAttachmentViewRotateLeft() {
        return Click.on(attachmentViewRotateLeft);
    }

    Performable pushAttachmentViewRotateRight() {
        return Click.on(attachmentViewRotateRight);
    }

    Performable pushAttachmentViewClose() {
        return Click.on(attachmentViewClose);
    }

    Performable pushAttachmetSelectNo() {
        return Click.on(attachmentSelectNo);
    }

    Performable pushAttachmentSelectYes() {
        return Click.on(attachmentSelectYes);
    }

    Performable pushAttachmentAlertClose() {
        return Click.on(attachmentAlertClose);
    }

    Performable pushAttachmentDocumentName() {
        return Click.on(attachmentDocumentName);
    }

    Performable pushAttachmentAlertContent() {
        return Click.on(attachmentAlertContent);
    }

    Performable pushAttachmentDropSection() {
        return Click.on(attachmentDropSection);
    }

    @PostConstruct
    void onPostConstruct() {

        attachmentFirstField = Target.the(AttachmentConstant.FIRST_FIELD).located(By.id(AttachmentConstant.FIRST_FIELD));
        attachmentIcon = Target.the(AttachmentConstant.ATTACHMENT_ICON).located(By.id(AttachmentConstant.ATTACHMENT_ICON));
        attachmentUploadDocument = Target.the(AttachmentConstant.ATTACHMENT_UPLOAD_DOCUMENT).located(By.id(AttachmentConstant.ATTACHMENT_UPLOAD_DOCUMENT));
        attachmentAddDocumentLibrary = Target.the(AttachmentConstant.ATTACHMENT_ADD_DOCUMENT_LIBRARY).located(By.id(AttachmentConstant.ATTACHMENT_ADD_DOCUMENT_LIBRARY));
        attachmentUpload = Target.the(AttachmentConstant.ATTACHMENT_UPLOAD).located(By.id(AttachmentConstant.ATTACHMENT_UPLOAD));
        attachmentBack = Target.the(AttachmentConstant.ATTACHMENT_BACK).located(By.id(AttachmentConstant.ATTACHMENT_BACK));
        attachmentSearch = Target.the(AttachmentConstant.ATTACHMENT_SEARCH).located(By.id(AttachmentConstant.ATTACHMENT_SEARCH));
        attachmentSearchIcon = Target.the(AttachmentConstant.ATTACHMENT_SEARCH_ICON).located(By.id(AttachmentConstant.ATTACHMENT_SEARCH_ICON));
        attachmentEdit = Target.the(AttachmentConstant.ATTACHMENT_EDIT).located(By.id(AttachmentConstant.ATTACHMENT_EDIT));
        attachmentDelete = Target.the(AttachmentConstant.ATTACHMENT_DELETE).located(By.id(AttachmentConstant.ATTACHMENT_DELETE));
        attachmentDownload = Target.the(AttachmentConstant.ATTACHMENT_DOWNLOAD).located(By.id(AttachmentConstant.ATTACHMENT_DOWNLOAD));
        attachmentVersion = Target.the(AttachmentConstant.ATTACHMENT_VERSION).located(By.id(AttachmentConstant.ATTACHMENT_VERSION));
        attachmentView = Target.the(AttachmentConstant.ATTACHMENT_VIEW).located(By.id(AttachmentConstant.ATTACHMENT_VIEW));
        attachmentSelectFromLibrary = Target.the(AttachmentConstant.ATTACHMENT_SELECT_FROM_LIBRARY).located(By.id(AttachmentConstant.ATTACHMENT_SELECT_FROM_LIBRARY));
        attachmentDeleteFromLibrary = Target.the(AttachmentConstant.ATTACHMENT_DELETE_FROM_LIBRARY).located(By.id(AttachmentConstant.ATTACHMENT_DELETE_FROM_LIBRARY));
        attachmentDownloandFromLibrary = Target.the(AttachmentConstant.ATTACHMENT_DOWNLOAD_FROM_LIBRARY).located(By.id(AttachmentConstant.ATTACHMENT_DOWNLOAD_FROM_LIBRARY));
        attachmentVersionFromLibrary = Target.the(AttachmentConstant.ATTACHMENT_VERSION_FROM_LIBRARY).located(By.id(AttachmentConstant.ATTACHMENT_VERSION_FROM_LIBRARY));
        attachmentViewFromLibrary = Target.the(AttachmentConstant.ATTACHMENT_VIEW_FROM_LIBRARY).located(By.id(AttachmentConstant.ATTACHMENT_VIEW_FROM_LIBRARY));
        attachmentDeleteYes = Target.the(AttachmentConstant.ATTACHMENT_DELETE_YES).located(By.id(AttachmentConstant.ATTACHMENT_DELETE_YES));
        attachmentDeleteNo = Target.the(AttachmentConstant.ATTACHMENT_DELETE_NO).located(By.id(AttachmentConstant.ATTACHMENT_DELETE_NO));
        attachmentUploadVersion = Target.the(AttachmentConstant.ATTACHMENT_UPLOAD_VERSION).located(By.id(AttachmentConstant.ATTACHMENT_UPLOAD_VERSION));
        attachmentInputTitle = Target.the(AttachmentConstant.ATTACHMENT_INPUT_TITLE).located(By.id(AttachmentConstant.ATTACHMENT_INPUT_TITLE));
        attachmentInputDescription = Target.the(AttachmentConstant.ATTACHMENT_INPUT_DESCRIPTION).located(By.id(AttachmentConstant.ATTACHMENT_INPUT_DESCRIPTION));
        attachmentInputFile = Target.the(AttachmentConstant.ATTACHMENT_INPUT_FILE).located(By.id(AttachmentConstant.ATTACHMENT_INPUT_FILE));
        attachmentItem = Target.the(AttachmentConstant.ATTACHMENT_ITEM).located(By.id(AttachmentConstant.ATTACHMENT_ITEM));
        attachmentSwith = Target.the(AttachmentConstant.ATTACHMENT_SWITCH).located(By.id(AttachmentConstant.ATTACHMENT_SWITCH));
        attachmentCancel = Target.the(AttachmentConstant.ATTACHMENT_CANCEL).located(By.id(AttachmentConstant.ATTACHMENT_CANCEL));
        attachmentSave = Target.the(AttachmentConstant.ATTACHMENT_SAVE).located(By.id(AttachmentConstant.ATTACHMENT_SAVE));
        attachmentViewZoomIn = Target.the(AttachmentConstant.ATTACHMENT_VIEW_ZOOM_IN).located(By.id(AttachmentConstant.ATTACHMENT_VIEW_ZOOM_IN));
        attachmentViewZoomOut = Target.the(AttachmentConstant.ATTACHMENT_VIEW_ZOOM_OUT).located(By.id(AttachmentConstant.ATTACHMENT_VIEW_ZOOM_OUT));
        attachmentViewRotateLeft = Target.the(AttachmentConstant.ATTACHMENT_VIEW_ROTATE_LEFT).located(By.id(AttachmentConstant.ATTACHMENT_VIEW_ROTATE_LEFT));
        attachmentViewRotateRight = Target.the(AttachmentConstant.ATTACHMENT_VIEW_ROTATE_RIGHT).located(By.id(AttachmentConstant.ATTACHMENT_VIEW_ROTATE_RIGHT));
        attachmentViewClose = Target.the(AttachmentConstant.ATTACHMENT_VIEW_CLOSE).located(By.id(AttachmentConstant.ATTACHMENT_VIEW_CLOSE));
        attachmentSelectNo = Target.the(AttachmentConstant.ATTACHMENT_SELECT_NO).located(By.id(AttachmentConstant.ATTACHMENT_SELECT_NO));
        attachmentSelectYes = Target.the(AttachmentConstant.ATTACHMENT_SELECT_YES).located(By.id(AttachmentConstant.ATTACHMENT_SELECT_YES));
        attachmentAlertClose = Target.the(AttachmentConstant.ATTACHMENT_ALERT_CLOSE).located(By.id(AttachmentConstant.ATTACHMENT_ALERT_CLOSE));
        attachmentDocumentName = Target.the(AttachmentConstant.ATTACHMENT_DOCUMENT_NAME).located(By.id(AttachmentConstant.ATTACHMENT_DOCUMENT_NAME));
        attachmentAlertContent = Target.the(AttachmentConstant.ATTACHMENT_ALERT_CONTENT).located(By.id(AttachmentConstant.ATTACHMENT_ALERT_CONTENT));
        attachmentDropSection = Target.the(AttachmentConstant.ATTACHMENT_DROP_SECTION).located(By.id(AttachmentConstant.ATTACHMENT_DROP_SECTION));
        attachmentSelectVersionOption = Target.the(AttachmentConstant.ATTACHMENT_SELECT_VERSION).located(By.id(AttachmentConstant.ATTACHMENT_SELECT_VERSION));
        attachmentSelectVersion = Target.the(AttachmentConstant.ATTACHMENT_SELECT_VERSION).located(By.id(AttachmentConstant.ATTACHMENT_SELECT_VERSION));
        attachmentItemLibrary = Target.the(AttachmentConstant.ATTACHMENT_ITEM).located(By.id(AttachmentConstant.ATTACHMENT_ITEM_LIBRARY));
    }
}
