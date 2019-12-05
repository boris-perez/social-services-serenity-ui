package com.dharbor.set.test.chat;

import com.dharbor.set.application.components.browser.OpenBrowser;
import com.dharbor.set.application.components.chat.*;
import com.dharbor.set.application.components.login.ConstantsLogin;
import com.dharbor.set.application.components.login.InsertCredentialsAndLogin;
import com.dharbor.set.test.AbstractTest;
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
    private InsertCredentialsAndLogin insertCredentialsAndLoginA;
    private ChatOption chatOption;
    private ChatCreateIndividualConversation chatCreateIndividualConversation;
    private ChatCreateGroupConversation chatCreateGroupConversation;
    private ChatAddParticipant chatAddParticipant;
    private ChatSendMessages chatSendMessages;
    private ChatRemoveParticipant chatRemoveParticipant;
    private ChatChangePrivacy chatChangePrivacy;
    private ChatMuteConversation chatMuteConversation;
    private ChatAddParticipantListConversation chatAddParticipantListConversation;
    private ChatHashTags chatHashTags;
    private ChatAddParticipantMentions chatAddParticipantMentions;
    private ChatJoinConversation chatJoinConversation;
    private ChatLeftConversation chatLeftConversation;
    private ChatSearchMessage chatSearchMessage;
    private ChatDeleteMessage chatDeleteMessage;
    private ChatReplyMessage chatReplyMessage;
    private ChatEditMessage chatEditMessage;
    private ChatSendMessagesWithDocument chatSendMessagesWithDocument;

    @Before
    public void setup() {
        fullScreen();
        initializeActor4(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        insertCredentialsAndLoginA = taskInstance(InsertCredentialsAndLogin.class);
        chatOption = taskInstance(ChatOption.class);
        chatCreateIndividualConversation = taskInstance(ChatCreateIndividualConversation.class);
        chatCreateGroupConversation = taskInstance(ChatCreateGroupConversation.class);
        chatAddParticipant = taskInstance(ChatAddParticipant.class);
        chatSendMessages = taskInstance(ChatSendMessages.class);
        chatRemoveParticipant = taskInstance(ChatRemoveParticipant.class);
        chatChangePrivacy = taskInstance(ChatChangePrivacy.class);
        chatMuteConversation = taskInstance(ChatMuteConversation.class);
        chatAddParticipantListConversation = taskInstance(ChatAddParticipantListConversation.class);
        chatHashTags = taskInstance(ChatHashTags.class);
        chatAddParticipantMentions = taskInstance(ChatAddParticipantMentions.class);
        chatJoinConversation = taskInstance(ChatJoinConversation.class);
        chatSearchMessage = taskInstance(ChatSearchMessage.class);
        chatLeftConversation = taskInstance(ChatLeftConversation.class);
        chatDeleteMessage = taskInstance(ChatDeleteMessage.class);
        chatReplyMessage = taskInstance(ChatReplyMessage.class);
        chatEditMessage = taskInstance(ChatEditMessage.class);
        chatSendMessagesWithDocument = taskInstance(ChatSendMessagesWithDocument.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
        insertCredentialsAndLoginA.setEmail(ChatConstant.EMAIL);
        insertCredentialsAndLoginA.setPassword(ConstantsLogin.PASSWORD);
        chatCreateGroupConversation.setName(ChatConstant.NAME_CONVERSATION);
        chatCreateGroupConversation.setUser(ChatConstant.EMAIL);
        chatSendMessages.setMessage(ChatConstant.MESSAGE_TEXT_A);
        chatHashTags.setMessage(ChatConstant.MESSAGE_HASH_TAG);
        chatAddParticipantMentions.setMessage(ChatConstant.MESSAGE_MENTION_A);
        chatSearchMessage.setText(ChatConstant.MESSAGE_TEXT_A);
        chatSendMessagesWithDocument.setImage(ChatConstant.FILE_IMAGE);
        chatSendMessagesWithDocument.setDoc(ChatConstant.FILE_DOC);
        chatSendMessagesWithDocument.setPdf(ChatConstant.FILE_PDF);
        chatDeleteMessage.setWebDriver(getWebDriver());
        chatEditMessage.setWebDriver(getWebDriver());
        chatEditMessage.setValue(ChatConstant.MESSAGE_TEXT_B);
        chatReplyMessage.setWebDriver(getWebDriver());
        chatReplyMessage.setValue(ChatConstant.MESSAGE_TEXT_B);
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
    public void verify_that_the_user_can_create_a_individual_conversation_and_send_screenShot() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        then(actor)
                .attemptsTo(chatCreateIndividualConversation);
    }

    @Test
    @WithTag("Send Message")
    public void verify_that_the_user_can_send_message() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        and(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatSendMessages);
    }

    @Test
    @WithTag("Delete Message")
    public void verify_that_the_user_can_delete_message() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        and(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatSendMessages);
        then(actor)
                .wasAbleTo(chatDeleteMessage);
    }

    @Test
    @WithTag("Reply Message")
    public void verify_that_the_user_can_reply_message() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        and(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        and(actor)
                .attemptsTo(chatSendMessages);
        then(actor)
                .attemptsTo(chatReplyMessage);
    }

    @Test
    @WithTag("edit Message")
    public void verify_that_the_user_can_edit_message() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(chatOption);
        and(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatSendMessages);
        then(actor)
                .wasAbleTo(chatEditMessage);
    }

    @Test
    @WithTag("Add participant")
    public void verify_that_the_user_can_add_participant_to_conversation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        and(actor)
                .attemptsTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatAddParticipant);
    }

    @Test
    @WithTag("Create group conversation")
    public void verify_that_the_user_can_create_group_conversation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        then(actor)
                .attemptsTo(chatCreateGroupConversation);
    }

    @Test
    @WithTag("Remove a participant")
    public void verify_that_the_user_can_remove_a_participant() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(chatOption);
        and(actor)
                .attemptsTo(chatCreateGroupConversation);
        then(actor)
                .attemptsTo(chatRemoveParticipant);
    }

    @Test
    @WithTag("Change the privacy")
    public void verify_that_the_user_can_change_the_privacy() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(chatOption);
        then(actor)
                .attemptsTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatChangePrivacy);
    }

    @Test
    @WithTag("Mute conversation")
    public void verify_that_the_user_can_mute_conversation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(chatOption);
        and(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatMuteConversation);
    }

    @Test
    @WithTag("Add participant from list conversation")
    public void verify_that_the_user_can_add_participant_from_list_conversation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .wasAbleTo(chatOption);
        and(actor)
                .attemptsTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatAddParticipantListConversation);
    }

    @Test
    @WithTag("Hash Tags")
    public void verify_that_the_user_can_send_hash_tags() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(chatOption);
        then(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatHashTags);
    }

    @Test
    @WithTag("Add participant with mentions")
    public void verify_that_the_user_can_add_participant_with_mentions() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(chatOption);
        and(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatAddParticipantMentions);
    }

    @Test
    @WithTag("Join Conversation")
    public void verify_that_the_user_can_join_to_conversation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(chatOption);
        then(actor)
                .attemptsTo(chatCreateIndividualConversation);
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLoginA);
        and(actor)
                .wasAbleTo(chatOption);
        then(actor)
                .attemptsTo(chatJoinConversation);
    }

    @Test
    @WithTag("Left conversation")
    public void verify_that_the_user_can_left_conversation() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .wasAbleTo(chatOption);
        then(actor)
                .attemptsTo(chatCreateIndividualConversation);
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLoginA);
        and(actor)
                .wasAbleTo(chatOption);
        then(actor)
                .attemptsTo(chatJoinConversation);
        then(actor)
                .attemptsTo(chatLeftConversation);
    }

    @Test
    @WithTag("Search Message")
    public void verify_that_the_user_can_search_message() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        and(actor)
                .wasAbleTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatSendMessages);
        then(actor)
                .attemptsTo(chatSearchMessage);
    }

    @Test
    @WithTag("Send messages with document")
    public void verify_that_the_user_can_send_message_with_document() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .wasAbleTo(insertCredentialsAndLogin);
        and(actor)
                .attemptsTo(chatOption);
        then(actor)
                .attemptsTo(chatCreateIndividualConversation);
        then(actor)
                .attemptsTo(chatSendMessagesWithDocument);
    }
}
