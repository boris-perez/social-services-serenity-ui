package com.dharbor.set.application.components.attachments;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class AttachmentSelectFromDocumentLibrary implements Task {


    @Autowired
    private AttachmentComponent component;

    @Setter
    private String documentTitle;

    @Setter
    private String documentDescription;

    @Setter
    private String url;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(component.getAttachmentItemLibrary()),
                component.pushAttachmentSelectFromLibrary(),
                component.pushAttachmentSelectYes(),
                MoveMouse.to(component.getAttachmentAlertContent())
        );
    }
}
