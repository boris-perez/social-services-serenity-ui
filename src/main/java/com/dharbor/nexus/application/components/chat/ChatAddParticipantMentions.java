package com.dharbor.nexus.application.components.chat;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatAddParticipantMentions implements Task {


    @Setter
    private String message;

    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.enterChatMessageInputMention(message),
                component.pushChatSendMessage()
        );
    }
}