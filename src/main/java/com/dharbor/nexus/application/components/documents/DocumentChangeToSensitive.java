package com.dharbor.nexus.application.components.documents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class DocumentChangeToSensitive implements Task {


    @Autowired
    private DocumentsComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushDocumentEdit(),
                component.pushDocumentSensitive(),
                component.pushDocumentSave()
        );
    }
}
