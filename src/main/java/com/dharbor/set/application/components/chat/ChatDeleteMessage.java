package com.dharbor.set.application.components.chat;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatDeleteMessage implements Task {


    @Autowired
    private ChatComponent component;

    @Setter
    private WebDriver webDriver;

    @Override
    public <T extends Actor> void performAs(T actor) {
        component.pushChatMessageOption(actor, webDriver);
        actor.attemptsTo(
                component.pushChatDeleteOption()
        );
    }
}
