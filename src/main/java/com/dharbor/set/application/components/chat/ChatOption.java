package com.dharbor.set.application.components.chat;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatOption implements Task {


    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                component.pushFirstField(),
                component.pushChatIcon(),
                component.pushChatOptionIcon(),
                component.pushChatOptionIcon()
        );
    }
}