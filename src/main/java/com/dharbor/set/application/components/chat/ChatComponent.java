package com.dharbor.set.application.components.chat;

import com.dharbor.set.application.framework.context.PrototypeScope;
import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.annotation.PostConstruct;
import java.nio.file.Paths;

/**
 * @author Boris Perez
 */
@PrototypeScope
class ChatComponent {

    @Getter
    private Target firstField;

    @Getter
    private Target chatIcon;

    @Getter
    private Target chatNew;

    @Getter
    private Target chatSearchConversation;

    @Getter
    private Target chatOptionIcon;

    @Getter
    private Target chatSelectContact;

    @Getter
    private Target chatSelectContactA;

    @Getter
    private Target chatSkip;

    @Getter
    private Target chatCreate;

    @Getter
    private Target chatBack;

    @Getter
    private Target chatSearchInput;

    @Getter
    private Target chatName;

    @Getter
    private Target chatSearchBtn;

    @Getter
    private Target chatSelectConversation;

    @Getter
    private Target chatMessageInput;

    @Getter
    private Target chatSendMessage;

    @Getter
    private Target chatMessageOption;

    @Getter
    private Target chatMessageOptionA;

    @Getter
    private Target chatEditOption;

    @Getter
    private Target chatDeleteOption;

    @Getter
    private Target chatReplyOption;

    @Getter
    private Target chatMenuArrow;

    @Getter
    private Target chatPrivacy;

    @Getter
    private Target chatMute;

    @Getter
    private Target chatAddParticipant;

    @Getter
    private Target chatAddParticipantOption;

    @Getter
    private Target chatAdd;

    @Getter
    private Target chatLeft;

    @Getter
    private Target chatSelectParticipant;

    @Getter
    private Target chatSelectArrow;

    @Getter
    private Target chatRemoveParticipant;

    @Getter
    private Target chatInput;

    @Getter
    private Target chatTittle;

    Performable pushFirstField() {
        return Click.on(firstField);
    }

    Performable pushChatIcon() {
        return Click.on(chatIcon);
    }

    Performable pushChatNew() {
        return Click.on(chatNew);
    }

    Performable pushChatSearchConversation() {
        return Click.on(chatSearchConversation);
    }

    Performable pushChatOptionIcon() {
        return Click.on(chatOptionIcon);
    }

    Performable pushChatSelectContact() {
        return Click.on(chatSelectContact);
    }

    Performable pushChatSelectContatA() {
        return Click.on(chatSelectContactA);
    }

    Performable pushChatSkip() {
        return Click.on(chatSkip);
    }

    Performable pushChatCreate() {
        return Click.on(chatCreate);
    }

    Performable pushChatBack() {
        return Click.on(chatBack);
    }

    Performable pushChatSearchBtn() {
        return Click.on(chatSearchBtn);
    }

    Performable pushChatSelectConversation() {
        return Click.on(chatSelectConversation);
    }

    Performable enterChatSearchInput(String value) {
        return Enter.theValue(value).into(chatSearchInput);
    }

    Performable enterChatMessageInput(String value) {
        return Enter.theValue(value).into(chatMessageInput);
    }

    Performable enterChatMessageInputMention(String value) {
        return Enter.theValue(value).into(chatMessageInput).thenHit(Keys.TAB);
    }

    Performable enterAttachmentInputFile(String value) {
        return Upload.theFile(Paths.get(value)).to(chatInput);
    }

    Performable enterChatNameInput(String value) {
        return Enter.theValue(value).into(chatName);
    }

    Performable pushChatSendMessage() {
        return Click.on(chatSendMessage);
    }

    void pushChatMessageOption(Actor actor, WebDriver webDriver) {
        Actions actions = new Actions(webDriver);
        actions.clickAndHold(chatMessageOption.resolveFor(actor)).build().perform();
    }

    Performable pushChatMessageOptionA() {
        return Click.on(chatMessageOptionA);
    }

    Performable pushChatEditOption() {
        return Click.on(chatEditOption);
    }

    Performable pushChatDeleteOption() {
        return Click.on(chatDeleteOption);
    }

    Performable pushChatReplyOption() {
        return Click.on(chatReplyOption);
    }

    Performable pushChatMenuArrow() {
        return Click.on(chatMenuArrow);
    }

    Performable pushChatPrivacy() {
        return Click.on(chatPrivacy);
    }

    Performable pushChatMute() {
        return Click.on(chatMute);
    }

    Performable pushChatAddParticipant() {
        return Click.on(chatAddParticipant);
    }

    Performable pushChatAddParticipantOption() {
        return Click.on(chatAddParticipantOption);
    }

    Performable pushChatAdd() {
        return Click.on(chatAdd);
    }

    Performable pushChatLeft() {
        return Click.on(chatLeft);
    }

    Performable pushChatSelectParticipant() {
        return Click.on(chatSelectParticipant);
    }

    Performable pushChatRemoveParticipant() {
        return Click.on(chatRemoveParticipant);
    }

    Performable pushChatTitle() {
        return Click.on(chatTittle);
    }

    Performable pushChatSelectArrow() {
        return Click.on(chatSelectArrow);
    }

    @PostConstruct
    void onPostConstruct() {

        firstField = Target.the(ChatConstant.FIRST_FIELD).located(By.id(ChatConstant.FIRST_FIELD));
        chatIcon = Target.the(ChatConstant.CHAT_ICON).located(By.id(ChatConstant.CHAT_ICON));
        chatNew = Target.the(ChatConstant.CHAT_NEW).located(By.id(ChatConstant.CHAT_NEW));
        chatSearchConversation = Target.the(ChatConstant.CHAT_SEARCH_CONVERSATION).located(By.id(ChatConstant.CHAT_SEARCH_CONVERSATION));
        chatOptionIcon = Target.the(ChatConstant.CHAT_OPTIONS_ICON).located(By.id(ChatConstant.CHAT_OPTIONS_ICON));
        chatSelectContact = Target.the(ChatConstant.CHAT_SELECT_CONTACT).located(By.id(ChatConstant.CHAT_SELECT_CONTACT));
        chatSelectContactA = Target.the(ChatConstant.CHAT_SELECT_CONTACT_A).located(By.id(ChatConstant.CHAT_SELECT_CONTACT_A));
        chatSkip = Target.the(ChatConstant.CHAT_SKIP).located(By.id(ChatConstant.CHAT_SKIP));
        chatCreate = Target.the(ChatConstant.CHAT_CREATE).located(By.id(ChatConstant.CHAT_CREATE));
        chatBack = Target.the(ChatConstant.CHAT_BACK).located(By.id(ChatConstant.CHAT_BACK));
        chatSearchInput = Target.the(ChatConstant.CHAT_SEARCH_INPUT).located(By.id(ChatConstant.CHAT_SEARCH_INPUT));
        chatName = Target.the(ChatConstant.CHAT_NAME).located(By.id(ChatConstant.CHAT_NAME));
        chatSearchBtn = Target.the(ChatConstant.CHAT_SEARCH_BTN).located(By.id(ChatConstant.CHAT_SEARCH_BTN));
        chatSelectConversation = Target.the(ChatConstant.CHAT_SELECT_CONVERSATION).located(By.id(ChatConstant.CHAT_SELECT_CONVERSATION));
        chatMessageInput = Target.the(ChatConstant.CHAT_MESSAGE_INPUT).located(By.id(ChatConstant.CHAT_MESSAGE_INPUT));
        chatSendMessage = Target.the(ChatConstant.CHAT_SEND_MESSAGE).located(By.id(ChatConstant.CHAT_SEND_MESSAGE));
        chatMessageOption = Target.the(ChatConstant.CHAT_MESSAGE_OPTIONS).located(By.id(ChatConstant.CHAT_MESSAGE_OPTIONS));
        chatMessageOptionA = Target.the(ChatConstant.CHAT_MESSAGE_OPTIONS_A).located(By.id(ChatConstant.CHAT_MESSAGE_OPTIONS_A));
        chatEditOption = Target.the(ChatConstant.CHAT_EDIT_OPTIONS).located(By.id(ChatConstant.CHAT_EDIT_OPTIONS));
        chatDeleteOption = Target.the(ChatConstant.CHAT_DELETE_OPTION).located(By.id(ChatConstant.CHAT_DELETE_OPTION));
        chatReplyOption = Target.the(ChatConstant.CHAT_REPLY_OPTION).located(By.id(ChatConstant.CHAT_REPLY_OPTION));
        chatMenuArrow = Target.the(ChatConstant.CHAT_MENU_ARROW).located(By.id(ChatConstant.CHAT_MENU_ARROW));
        chatPrivacy = Target.the(ChatConstant.CHAT_PRIVACY).located(By.id(ChatConstant.CHAT_PRIVACY));
        chatMute = Target.the(ChatConstant.CHAT_MUTE).located(By.id(ChatConstant.CHAT_MUTE));
        chatAddParticipant = Target.the(ChatConstant.CHAT_ADD_PARTICIPANT).located(By.id(ChatConstant.CHAT_ADD_PARTICIPANT));
        chatAddParticipantOption = Target.the(ChatConstant.CHAT_ADD_PARTICIPANT_OPTION).located(By.id(ChatConstant.CHAT_ADD_PARTICIPANT_OPTION));
        chatAdd = Target.the(ChatConstant.CHAT_ADD).located(By.id(ChatConstant.CHAT_ADD));
        chatLeft = Target.the(ChatConstant.CHAT_LEFT).located(By.id(ChatConstant.CHAT_LEFT));
        chatSelectParticipant = Target.the(ChatConstant.CHAT_SELECT_PARTICIPANT).located(By.id(ChatConstant.CHAT_SELECT_PARTICIPANT));
        chatSelectArrow = Target.the(ChatConstant.CHAT_SELECT_ARROW).located(By.id(ChatConstant.CHAT_SELECT_ARROW));
        chatRemoveParticipant = Target.the(ChatConstant.CHAT_REMOVE_PARTICIPANT).located(By.id(ChatConstant.CHAT_REMOVE_PARTICIPANT));
        chatInput = Target.the(ChatConstant.CHAT_INPUT).located(By.id(ChatConstant.CHAT_INPUT));
        chatTittle = Target.the(ChatConstant.CHAT_TITLE).located(By.id(ChatConstant.CHAT_TITLE));
    }
}
