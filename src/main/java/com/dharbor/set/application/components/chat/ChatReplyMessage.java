package com.dharbor.set.application.components.chat;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatReplyMessage implements Task {


    @Autowired
    private ChatComponent component;

    @Setter
    private WebDriver webDriver;

    @Setter
    private String value;

    @Override
    public <T extends Actor> void performAs(T actor) {
        component.pushChatMessageOption(actor, webDriver);
        actor.attemptsTo(
                component.pushChatReplyOption(),
                component.enterChatMessageInput(value),
                component.pushChatSendMessage()
        );
    }
}
