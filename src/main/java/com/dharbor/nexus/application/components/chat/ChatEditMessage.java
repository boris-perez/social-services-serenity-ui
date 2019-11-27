package com.dharbor.nexus.application.components.chat;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatEditMessage implements Task {


    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushChatNew(),
                component.pushChatSkip(),
                component.pushChatCreate(),
                component.pushChatSendMessage()
        );
    }
}
