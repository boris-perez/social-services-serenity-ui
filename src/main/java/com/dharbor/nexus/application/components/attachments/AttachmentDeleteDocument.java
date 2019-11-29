package com.dharbor.nexus.application.components.attachments;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class AttachmentDeleteDocument implements Task {


    @Autowired
    private AttachmentComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(component.getAttachmentItem()),
                component.pushAttachmentDelete(),
                component.pushAttachmentDeleteNo(),
                MoveMouse.to(component.getAttachmentItem()),
                component.pushAttachmentDeleteYes(),
                MoveMouse.to(component.getAttachmentAlertContent())
        );
    }
}
