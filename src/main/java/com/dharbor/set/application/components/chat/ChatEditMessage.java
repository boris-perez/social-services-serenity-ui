package com.dharbor.set.application.components.chat;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatEditMessage implements Task {


    @Autowired
    private ChatComponent component;

    @Setter
    private String value;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushChatEditOption(),
                component.enterChatMessageInput(value),
                component.pushChatSendMessage()
        );
    }
}