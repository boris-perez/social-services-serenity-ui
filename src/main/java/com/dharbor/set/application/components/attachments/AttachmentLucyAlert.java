package com.dharbor.set.application.components.attachments;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class AttachmentLucyAlert implements Question<String> {

    @Autowired
    private AttachmentComponent component;

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(component.getAttachmentAlertContent()).viewedBy(actor).resolve();
    }
}
