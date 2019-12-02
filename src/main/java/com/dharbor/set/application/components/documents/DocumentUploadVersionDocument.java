package com.dharbor.set.application.components.documents;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class DocumentUploadVersionDocument implements Task {


    @Autowired
    private DocumentsComponent component;

    @Setter
    private String documentTitle;

    @Setter
    private String documentDescription;

    @Setter
    private String url;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushDocumentVersion(),
                component.pushDocumentUploadVersion(),
                component.enterDocumentInputTitle(documentTitle),
                component.enterDocumentInputDescription(documentDescription),
                component.enterDocumentInputFile(url),
                component.pushDocumentUpload()
        );
    }
}
