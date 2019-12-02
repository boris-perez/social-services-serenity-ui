package com.dharbor.set.application.components.chat;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ChatSendMessagesWithDocument implements Task {

    @Setter
    private String image;

    @Setter
    private String pdf;

    @Setter
    private String doc;

    @Autowired
    private ChatComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.enterAttachmentInputFile(image),
                component.pushChatSendMessage(),
                component.enterAttachmentInputFile(pdf),
                component.pushChatSendMessage(),
                component.enterAttachmentInputFile(doc),
                component.pushChatSendMessage()
        );
    }
}
