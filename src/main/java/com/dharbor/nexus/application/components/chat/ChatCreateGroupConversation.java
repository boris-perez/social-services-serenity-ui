package com.dharbor.nexus.application.components.chat;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatCreateGroupConversation implements Task {

    @Setter
    private String user;

    @Setter
    private String name;

    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushChatNew(),
                component.enterChatSearchInput(user),
                component.pushChatSelectContatA(),
                component.pushChatSkip(),
                component.enterChatNameInput(name),
                component.pushChatCreate(),
                component.pushChatSendMessage()
        );
    }
}
