package com.dharbor.nexus.test;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.login.*;
import net.serenitybdd.screenplay.Actor;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;

/**
 * @author Ivan Alban
 */
public class LoginApplicationTest extends AbstractTest {

    private Actor actor = Actor.named("ivan");

    private OpenBrowser openBrowser;

    private InsertCredentialsAndLogin insertCredentialsAndLogin;

    @Before
    public void setup() {
        initializeActor(actor);

        openBrowser = taskInstance(OpenBrowser.class);

        insertCredentialsAndLogin = taskInstance(InsertCredentialsAndLogin.class);
        insertCredentialsAndLogin.setEmail("cr1@yopmail.com");
        insertCredentialsAndLogin.setPassword("Password1!");
    }

    @Test
    public void userLogin() {
        givenThat(actor)
                .attemptsTo(openBrowser);

        then(actor)
                .attemptsTo(insertCredentialsAndLogin);
    }
}
