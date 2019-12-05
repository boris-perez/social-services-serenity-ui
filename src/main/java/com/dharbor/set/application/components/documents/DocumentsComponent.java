package com.dharbor.set.application.components.documents;

import com.dharbor.set.application.framework.context.PrototypeScope;
import lombok.Getter;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.annotation.PostConstruct;
import java.nio.file.Paths;

/**
 * @author Boris Perez
 */
@PrototypeScope
class DocumentsComponent {

    @Getter
    private Target documentUploadDocument;

    @Getter
    private Target documentUpload;

    @Getter
    private Target documentBack;

    @Getter
    private Target documentEdit;

    @Getter
    private Target documentDelete;

    @Getter
    private Target documentDownload;

    @Getter
    private Target documentVersion;

    @Getter
    private Target documentView;

    @Getter
    private Target documentDeleteYes;

    @Getter
    private Target documentDeleteNo;

    @Getter
    private Target documentUploadVersion;

    @Getter
    private Target documentInputTitle;

    @Getter
    private Target documentInputTitleEdit;

    @Getter
    private Target documentInputDescription;

    @Getter
    private Target documentInputFile;

    @Getter
    private Target documentSensitive;

    @Getter
    private Target documentCancel;

    @Getter
    private Target documentSave;

    @Getter
    private Target documentViewZoomIn;

    @Getter
    private Target documentViewZoomOut;

    @Getter
    private Target documentViewRotateLeft;

    @Getter
    private Target documentViewRotateRight;

    @Getter
    private Target documentViewClose;

    @Getter
    private Target documentSelectVersion;

    @Getter
    private Target documentPagination;

    @Getter
    private Target documentNavigationNext;

    @Getter
    private Target documentNavigationPrevious;

    @Getter
    private Target documentModalTitle;

    @Getter
    private Target documentPanelTitle;

    @Getter
    private Target documentPanelTitleVersions;

    @Getter
    private Target documentLibrary;

    @Getter
    private Target documentVersionNew;


    Performable pushDocumentUploadDocument() {
        return Click.on(documentUploadDocument);
    }

    Performable pushDocumentUpload() {
        return Click.on(documentUpload);
    }

    Performable pushDocumentEdit() {
        return Click.on(documentEdit);
    }

    Performable pushDocumentDelete() {
        return Click.on(documentDelete);
    }

    Performable pushDocumentDownload() {
        return Click.on(documentDownload);
    }

    Performable pushDocumentVersion() {
        return Click.on(documentVersion);
    }

    Performable pushDocumentView() {
        return Click.on(documentView);
    }

    Performable pushDocumentDeleteYes() {
        return Click.on(documentDeleteYes);
    }

    Performable pushDocumentDeleteNo() {
        return Click.on(documentDeleteNo);
    }

    Performable pushDocumentUploadVersion() {
        return Click.on(documentUploadVersion);
    }

    Performable pushDocumentSensitive() {
        return Click.on(documentSensitive);
    }

    Performable enterDocumentInputTitle(String value) {
        return Enter.theValue(value).into(documentInputTitle).thenHit(Keys.TAB);
    }

    Performable enterDocumentTitleEdit(String value) {
        return Enter.theValue(value).into(documentInputTitleEdit).thenHit(Keys.TAB);
    }

    Performable enterDocumentInputDescription(String value) {
        return Enter.theValue(value).into(documentInputDescription).thenHit(Keys.TAB);
    }

    Performable enterDocumentInputFile(String value) {
        return Upload.theFile(Paths.get(value)).to(documentInputFile);
    }

    Performable pushDocumentCancel() {
        return Click.on(documentCancel);
    }

    Performable pushDocumentSave() {
        return Click.on(documentSave);
    }

    Performable pushDocumentViewZoomIn() {
        return Click.on(documentViewZoomIn);
    }

    Performable pushDocumentViewZoomOut() {
        return Click.on(documentViewZoomOut);
    }

    Performable pushDocumentViewRotateLeft() {
        return Click.on(documentViewRotateLeft);
    }

    Performable pushDocumentViewRotateRight() {
        return Click.on(documentViewRotateRight);
    }

    Performable pushDocumentSelectVersion() {
        return Click.on(documentSelectVersion);
    }

    Performable pushDocumentLibrary() {
        return Click.on(documentLibrary);
    }

    @PostConstruct
    void onPostConstruct() {

        documentUploadDocument = Target.the(DocumentsConstant.DOCUMENT_UPLOAD_DOCUMENT).located(By.id(DocumentsConstant.DOCUMENT_UPLOAD_DOCUMENT));
        documentUpload = Target.the(DocumentsConstant.DOCUMENT_UPLOAD).located(By.id(DocumentsConstant.DOCUMENT_UPLOAD));
        documentBack = Target.the(DocumentsConstant.DOCUMENT_BACK).located(By.id(DocumentsConstant.DOCUMENT_BACK));
        documentEdit = Target.the(DocumentsConstant.DOCUMENT_EDIT).located(By.id(DocumentsConstant.DOCUMENT_EDIT));
        documentDelete = Target.the(DocumentsConstant.DOCUMENT_DELETE).located(By.id(DocumentsConstant.DOCUMENT_DELETE));
        documentDownload = Target.the(DocumentsConstant.DOCUMENT_DOWNLOAD).located(By.id(DocumentsConstant.DOCUMENT_DOWNLOAD));
        documentVersion = Target.the(DocumentsConstant.DOCUMENT_VERSION).located(By.id(DocumentsConstant.DOCUMENT_VERSION));
        documentView = Target.the(DocumentsConstant.DOCUMENT_VIEW).located(By.id(DocumentsConstant.DOCUMENT_VIEW));
        documentDeleteYes = Target.the(DocumentsConstant.DOCUMENT_DELETE_YES).located(By.id(DocumentsConstant.DOCUMENT_DELETE_YES));
        documentDeleteNo = Target.the(DocumentsConstant.DOCUMENT_DELETE_NO).located(By.id(DocumentsConstant.DOCUMENT_DELETE_NO));
        documentUploadVersion = Target.the(DocumentsConstant.DOCUMENT_UPLOAD_VERSION).located(By.id(DocumentsConstant.DOCUMENT_UPLOAD_VERSION));
        documentInputTitle = Target.the(DocumentsConstant.DOCUMENT_INPUT_TITLE).located(By.id(DocumentsConstant.DOCUMENT_INPUT_TITLE));
        documentInputTitleEdit = Target.the(DocumentsConstant.DOCUMENT_INPUT_TITLE_EDIT).located(By.id(DocumentsConstant.DOCUMENT_INPUT_TITLE_EDIT));
        documentInputDescription = Target.the(DocumentsConstant.DOCUMENT_INPUT_DESCRIPTION).located(By.id(DocumentsConstant.DOCUMENT_INPUT_DESCRIPTION));
        documentInputFile = Target.the(DocumentsConstant.DOCUMENT_INPUT_FILE).located(By.id(DocumentsConstant.DOCUMENT_INPUT_FILE));
        documentSensitive = Target.the(DocumentsConstant.DOCUMENT_SENSITIVE).located(By.id(DocumentsConstant.DOCUMENT_SENSITIVE));
        documentCancel = Target.the(DocumentsConstant.DOCUMENT_CANCEL).located(By.id(DocumentsConstant.DOCUMENT_CANCEL));
        documentSave = Target.the(DocumentsConstant.DOCUMENT_SAVE).located(By.id(DocumentsConstant.DOCUMENT_SAVE));
        documentViewZoomIn = Target.the(DocumentsConstant.DOCUMENT_VIEW_ZOOM_IN).located(By.id(DocumentsConstant.DOCUMENT_VIEW_ZOOM_IN));
        documentViewZoomOut = Target.the(DocumentsConstant.DOCUMENT_VIEW_ZOOM_OUT).located(By.id(DocumentsConstant.DOCUMENT_VIEW_ZOOM_OUT));
        documentViewRotateLeft = Target.the(DocumentsConstant.DOCUMENT_VIEW_ROTATE_LEFT).located(By.id(DocumentsConstant.DOCUMENT_VIEW_ROTATE_LEFT));
        documentViewRotateRight = Target.the(DocumentsConstant.DOCUMENT_VIEW_ROTATE_RIGHT).located(By.id(DocumentsConstant.DOCUMENT_VIEW_ROTATE_RIGHT));
        documentViewClose = Target.the(DocumentsConstant.DOCUMENT_VIEW_CLOSE).located(By.id(DocumentsConstant.DOCUMENT_VIEW_CLOSE));
        documentSelectVersion = Target.the(DocumentsConstant.DOCUMENT_SELECT_VERSION).located(By.id(DocumentsConstant.DOCUMENT_SELECT_VERSION));
        documentPagination = Target.the(DocumentsConstant.DOCUMENT_PAGINATION).located(By.id(DocumentsConstant.DOCUMENT_PAGINATION));
        documentNavigationNext = Target.the(DocumentsConstant.DOCUMENT_NAVIGATION_NEXT).located(By.id(DocumentsConstant.DOCUMENT_NAVIGATION_NEXT));
        documentNavigationPrevious = Target.the(DocumentsConstant.DOCUMENT_NAVIGATION_PREVIOUS).located(By.id(DocumentsConstant.DOCUMENT_NAVIGATION_PREVIOUS));
        documentModalTitle = Target.the(DocumentsConstant.DOCUMENT_MODAL_TITLE).located(By.id(DocumentsConstant.DOCUMENT_MODAL_TITLE));
        documentPanelTitle = Target.the(DocumentsConstant.DOCUMENT_PANEL_TITLE).located(By.id(DocumentsConstant.DOCUMENT_PANEL_TITLE));
        documentPanelTitleVersions = Target.the(DocumentsConstant.DOCUMENT_PANEL_TITLE_VERSIONS).located(By.id(DocumentsConstant.DOCUMENT_PANEL_TITLE_VERSIONS));
        documentLibrary = Target.the(DocumentsConstant.DOCUMENT_LIBRARY).located(By.id(DocumentsConstant.DOCUMENT_LIBRARY));
        documentVersionNew = Target.the(DocumentsConstant.DOCUMENT_VERSION_NEW).located(By.id(DocumentsConstant.DOCUMENT_VERSION_NEW));
    }
}
