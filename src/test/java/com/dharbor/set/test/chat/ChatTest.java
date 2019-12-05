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
    private ChatOptionsMessage chatOptionsMessage;
    private ChatSendMessagesWithDocument chatSendMessagesWithDocument;
    private ChatTitleExits chatTitleExits;
    private ChatInputMessageExits chatInputMessageExits;
    private ChatSendMessageExits chatSendMessageExits;
    private ChatItemMessageExits chatItemMessageExits;
    private ChatDeleteOptionExits chatDeleteOptionExits;
    private ChatEditOptionExits chatEditOptionExits;
    private ChatReplyOptionExits chatReplyOptionExits;
    private ChatSelectConversationOption chatSelectConversationOption;
    private ChatAddParticipantExits chatAddParticipantExits;
    private ChatSelectRemoveParticipantOption chatSelectRemoveParticipantOption;
    private ChatRemoveOptionExits chatRemoveOptionExits;
    private ChatMessagesOptionListConversation chatMessagesOptionListConversation;
    private ChatPrivacyConversatioExits chatPrivacyConversatioExits;
    private ChatMuteConversatioExits chatMuteConversatioExits;
    private ChatAddParticipantFromListConversationExits chatAddParticipantFromListConversationExits;
    private ChatItemConversationExits chatItemConversationExits;

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
        chatOptionsMessage = taskInstance(ChatOptionsMessage.class);
        chatSendMessagesWithDocument = taskInstance(ChatSendMessagesWithDocument.class);
        chatSelectConversationOption = taskInstance(ChatSelectConversationOption.class);
        chatSelectRemoveParticipantOption = taskInstance(ChatSelectRemoveParticipantOption.class);
        chatMessagesOptionListConversation = taskInstance(ChatMessagesOptionListConversation.class);

        chatTitleExits = questionInstance(ChatTitleExits.class);
        chatInputMessageExits = questionInstance(ChatInputMessageExits.class);
        chatSendMessageExits = questionInstance(ChatSendMessageExits.class);
        chatItemMessageExits = questionInstance(ChatItemMessageExits.class);
        chatDeleteOptionExits = questionInstance(ChatDeleteOptionExits.class);
        chatEditOptionExits = questionInstance(ChatEditOptionExits.class);
        chatReplyOptionExits = questionInstance(ChatReplyOptionExits.class);
        chatAddParticipantExits = questionInstance(ChatAddParticipantExits.class);
        chatRemoveOptionExits = questionInstance(ChatRemoveOptionExits.class);
        chatMuteConversatioExits = questionInstance(ChatMuteConversatioExits.class);
        chatPrivacyConversatioExits = questionInstance(ChatPrivacyConversatioExits.class);
        chatAddParticipantFromListConversationExits = questionInstance(ChatAddParticipantFromListConversationExits.class);
        chatItemConversationExits = questionInstance(ChatItemConversationExits.class);

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
        chatEditMessage.setValue(ChatConstant.MESSAGE_TEXT_B);
        chatOptionsMessage.setWebDriver(getWebDriver());
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
        then(actor).should(
                seeThat(chatTitleExits)
        );
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
        then(actor).should(
                seeThat(chatTitleExits)
        );
        then(actor)
                .attemptsTo(chatCreateIndividualConversation);
        then(actor).should(
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
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
        then(actor).should(
                seeThat(chatItemMessageExits),
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
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
        and(actor)
                .attemptsTo(chatSendMessages);
        then(actor)
                .attemptsTo(chatOptionsMessage);
        then(actor).should(
                seeThat(chatDeleteOptionExits)
        );
        then(actor)
                .wasAbleTo(chatDeleteMessage);
        then(actor).should(
                seeThat(chatItemMessageExits),
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
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
                .attemptsTo(chatOptionsMessage);
        then(actor).should(
                seeThat(chatReplyOptionExits)
        );
        then(actor)
                .attemptsTo(chatReplyMessage);
        then(actor).should(
                seeThat(chatItemMessageExits),
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
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
                .attemptsTo(chatOptionsMessage);
        then(actor).should(
                seeThat(chatEditOptionExits)
        );
        then(actor)
                .wasAbleTo(chatEditMessage);
        then(actor).should(
                seeThat(chatItemMessageExits),
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
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
        and(actor)
                .wasAbleTo(chatSelectConversationOption);
        and(actor).should(
                seeThat(chatAddParticipantExits)
        );
        then(actor)
                .attemptsTo(chatAddParticipant);
        then(actor).should(
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
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
        and(actor)
                .attemptsTo(chatCreateGroupConversation);
        then(actor).should(
                seeThat(chatInputMessageExits),
                seeThat(chatSendMessageExits)
        );
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
        and(actor)
                .wasAbleTo(chatSelectConversationOption);
        then(actor)
                .attemptsTo(chatRemoveParticipant);
        then(actor).should(
                seeThat(chatRemoveOptionExits)
        );
        then(actor)
                .attemptsTo(chatSelectRemoveParticipantOption);
        then(actor).should(
                seeThat(chatAddParticipantExits)
        );
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
        and(actor)
                .wasAbleTo(chatMessagesOptionListConversation);
        then(actor).should(
                seeThat(chatPrivacyConversatioExits)
        );
        then(actor)
                .attemptsTo(chatChangePrivacy);
        then(actor).should(
                seeThat(chatPrivacyConversatioExits),
                seeThat(chatTitleExits)
        );
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
        and(actor)
                .wasAbleTo(chatMessagesOptionListConversation);
        then(actor).should(
                seeThat(chatMuteConversatioExits)
        );
        then(actor)
                .attemptsTo(chatMuteConversation);
        then(actor).should(
                seeThat(chatTitleExits)
        );
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
        and(actor)
                .wasAbleTo(chatMessagesOptionListConversation);
        then(actor).should(
                seeThat(chatAddParticipantFromListConversationExits)
        );
        then(actor)
                .attemptsTo(chatAddParticipantListConversation);
        then(actor).should(
                seeThat(chatInputMessageExits)
        );
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
        then(actor).should(
                seeThat(chatInputMessageExits),
                seeThat(chatSendMessageExits)
        );
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
        then(actor).should(
                seeThat(chatInputMessageExits),
                seeThat(chatSendMessageExits)
        );
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
        then(actor).should(
                seeThat(chatInputMessageExits),
                seeThat(chatSendMessageExits)
        );
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
        then(actor).should(
                seeThat(chatItemConversationExits)
        );
        then(actor)
                .attemptsTo(chatJoinConversation);
        then(actor)
                .attemptsTo(chatLeftConversation);
        then(actor).should(
                seeThat(chatItemConversationExits)
        );
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
        then(actor).should(
                seeThat(chatItemMessageExits),
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
        then(actor)
                .attemptsTo(chatSearchMessage);
        then(actor).should(
                seeThat(chatItemMessageExits),
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
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
        then(actor).should(
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );
        then(actor)
                .attemptsTo(chatSendMessagesWithDocument);
        then(actor).should(
                seeThat(chatItemMessageExits),
                seeThat(chatSendMessageExits),
                seeThat(chatInputMessageExits)
        );

    }
}
