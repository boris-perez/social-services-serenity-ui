package com.dharbor.nexus.test;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.login.*;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;

/**
 * @author Ivan Alban
 */
@WithTag("LOGIN")
public class LoginApplicationTest extends AbstractTest {

    private Actor actor = Actor.named("ivan");

    private OpenBrowser openBrowser;

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    @Before
    public void setup() {
        initializeActor(actor);

        openBrowser = taskInstance(OpenBrowser.class);

        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        insertCredentialsAndLogin.setEmail(ConstantsLogin.EMAIL);
        insertCredentialsAndLogin.setPassword(ConstantsLogin.PASSWORD);
    }

    @Test
    public void userLogin() {
        givenThat(actor)
                .attemptsTo(openBrowser);

        then(actor)
                .attemptsTo(insertCredentialsAndLogin);
    }
}
