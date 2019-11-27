package com.dharbor.nexus.application.components.chat;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatOption implements Task {


    @Autowired
    private ChatComponent component;

    @FindBy(id = ChatConstant.CHAT_NEW)
    private WebElement chatNewIcon;

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
