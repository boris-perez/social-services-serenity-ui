package com.dharbor.set.application.components.chat;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.springframework.beans.factory.annotation.Autowired;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * @author Boris Perez
 */
public class ChatCreateIndividualConversation implements Task {


    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                component.pushChatNew(),
                component.pushChatSkip(),
                component.pushChatCreate(),
                component.pushChatSendMessage(),
                WaitUntil.the(component.getChatBack(), isVisible()).forNoMoreThan(15).seconds()

     );
    }
}
