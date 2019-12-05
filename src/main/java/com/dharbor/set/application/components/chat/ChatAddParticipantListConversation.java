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
public class ChatAddParticipantListConversation implements Task {


    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushChatBack(),
                MoveMouse.to(component.getChatTittle()),
                WaitUntil.the(component.getChatSelectConversation(), isVisible()).forNoMoreThan(15).seconds(),
                MoveMouse.to(component.getChatSelectConversation()),
                component.pushChatMenuArrow(),
                component.pushChatAddParticipant(),
                component.pushChatSelectContact(),
                component.pushChatAdd()
        );
    }
}
