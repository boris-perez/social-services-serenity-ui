package com.dharbor.nexus.test.chat;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.chat.ChatCreateIndividualConversation;
import com.dharbor.nexus.application.components.chat.ChatOption;
import com.dharbor.nexus.application.components.documents.DocumentUploadDocument;
import com.dharbor.nexus.application.components.documents.DocumentsConstant;
import com.dharbor.nexus.application.components.explanation.*;
import com.dharbor.nexus.application.components.login.ConstantsLogin;
import com.dharbor.nexus.application.components.login.InsertCredentialsAndLogin;
import com.dharbor.nexus.test.AbstractTest;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

/**
 * @author Boris Perez
 */
@WithTag("CHAT")
public class ChatTest extends AbstractTest {

    private Actor actor = Actor.named("boris");
    private OpenBrowser openBrowser;
    private InsertCredentialsAndLogin insertCredentialsAndLogin;
    private ChatOption chatOption;
    private ChatCreateIndividualConversation chatCreateIndividualConversation;

    @Before
    public void setup() {
        initializeActor4(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        chatOption = taskInstance(ChatOption.class);
        chatCreateIndividualConversation = taskInstance(ChatCreateIndividualConversation.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
    }

    @Test
    @WithTag("Open Social Chat")
    public void verify_that_the_user_can_open_the_option_of_Social_Chat() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(chatOption);
    }

    @Test
    @WithTag("Create Individual conversation")
    public void verify_that_the_user_can_create_a_individual_conversation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        then(actor)
                .attemptsTo(chatCreateIndividualConversation);
    }
}
