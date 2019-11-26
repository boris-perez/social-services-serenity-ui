package com.dharbor.nexus.application.components.documents;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * @author Boris Perez
 */
public class DocumentUploadDocument implements Task {


    @Autowired
    private DocumentsComponent component;

    @Setter
    private String documentTitle;

    @Setter
    private String documentDescription;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushDocumentLibrary(),
                component.pushDocumentUploadDocument(),
                component.pushDocumentCancel(),
                component.pushDocumentUploadDocument(),
                component.enterDocumentInputTitle(documentTitle),
                component.enterDocumentInputDescription(documentDescription),
                component.enterDocumentInputFile(DocumentsConstant.FILE_IMAGE),
                component.pushDocumentUpload()
        );
    }
}
