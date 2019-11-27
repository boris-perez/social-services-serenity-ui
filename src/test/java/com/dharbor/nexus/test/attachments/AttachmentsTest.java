package com.dharbor.nexus.test.attachments;

import com.dharbor.nexus.application.components.attachments.AttachmentOption;
import com.dharbor.nexus.application.components.browser.OpenBrowser;
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
@WithTag("ATTACHMENT")
public class AttachmentsTest extends AbstractTest {

    private Actor actor = Actor.named("boris");

    private OpenBrowser openBrowser;

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    private AttachmentOption attachmentOption;



    @Before
    public void setup() {
        initializeActor3(actor);

        openBrowser = taskInstance(OpenBrowser.class);
        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        attachmentOption = taskInstance(AttachmentOption.class);

        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
    }

    @Test
    @WithTag("Upload Document")
    public void verify_that_the_user_can_open_the_attachment_option() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        when(actor)
                .attemptsTo(insertCredentialsAndLogin);
        then(actor)
                .attemptsTo(attachmentOption);
    }
}
