package com.dharbor.set.application.components.attachments;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class AttachmentDeleteFromDocumentLibrary implements Task {


    @Autowired
    private AttachmentComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushAttachmentAddDocumentLibrary(),
                MoveMouse.to(component.getAttachmentItem()),
                component.pushAttachmentDeleteFromLibrary(),
                component.pushAttachmentDeleteYes(),
                MoveMouse.to(component.getAttachmentAlertContent())
        );
    }
}
