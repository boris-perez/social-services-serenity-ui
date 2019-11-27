package com.dharbor.nexus.application.components.chat;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.remote.server.handler.interactions.MouseDown;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatDeleteMessage implements Task {


    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushChatMessageOption(),
                component.pushChatMessageOption()
//                component.pushChatDeleteOption()
        );
    }
}
