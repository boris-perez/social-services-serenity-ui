package com.dharbor.nexus.application.components.documents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class DocumentDeleteDocument implements Task {


    @Autowired
    private DocumentsComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(component.getDocumentDelete()),
                component.pushDocumentDelete(),
                component.pushDocumentDeleteNo(),
                component.pushDocumentDelete(),
                component.pushDocumentDeleteYes()
        );
    }
}
