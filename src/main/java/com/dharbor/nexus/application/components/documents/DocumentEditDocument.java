package com.dharbor.nexus.application.components.documents;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class DocumentEditDocument implements Task {


    @Autowired
    private DocumentsComponent component;

    @Setter
    private String documentTitle;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(component.getDocumentEdit()),
                component.pushDocumentEdit(),
                component.enterDocumentTitleEdit(documentTitle),
                component.pushDocumentSave()
        );
    }
}
