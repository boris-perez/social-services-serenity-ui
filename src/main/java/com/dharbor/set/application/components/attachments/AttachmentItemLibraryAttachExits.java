package com.dharbor.set.application.components.attachments;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class AttachmentItemLibraryAttachExits implements Question<Boolean> {

    @Autowired
    private AttachmentComponent component;

    @Override
    public Boolean answeredBy(Actor actor) {
        return Presence.of(component.getAttachmentItemLibrary()).viewedBy(actor).resolve();
    }
}