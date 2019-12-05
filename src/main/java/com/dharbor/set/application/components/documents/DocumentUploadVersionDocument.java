package com.dharbor.set.application.components.documents;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.springframework.beans.factory.annotation.Autowired;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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
                WaitUntil.the(component.getDocumentDownload(), isVisible()).forNoMoreThan(15).seconds(),
                MoveMouse.to(component.getDocumentVersion()),
                component.pushDocumentVersion(),
                component.pushDocumentUploadVersion(),
                component.enterDocumentInputTitle(documentTitle),
                component.enterDocumentInputDescription(documentDescription),
                component.enterDocumentInputFile(url),
                component.pushDocumentUpload()
        );
    }
}
