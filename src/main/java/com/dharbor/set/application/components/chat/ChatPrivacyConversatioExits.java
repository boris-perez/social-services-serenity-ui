package com.dharbor.set.application.components.chat;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatPrivacyConversatioExits implements Question<Boolean> {

    @Autowired
    private ChatComponent component;

    @Override
    public Boolean answeredBy(Actor actor) {
        return Presence.of(component.getChatPrivacy()).viewedBy(actor).resolve();
    }
}
