package com.dharbor.nexus.test;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.login.EmailLabel;
import com.dharbor.nexus.application.components.login.HeaderTitle;
import net.serenitybdd.screenplay.Actor;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static org.hamcrest.Matchers.is;

/**
 * @author Ivan Alban
 */
public class OpenApplicationTest extends AbstractTest {

    private Actor actor = Actor.named("ivan");

    private OpenBrowser openBrowser;

    private HeaderTitle headerTitle;

    private EmailLabel emailLabel;

    @Before
    public void setup() {
        initializeActor(actor);

        openBrowser = taskInstance(OpenBrowser.class);

        headerTitle = questionInstance(HeaderTitle.class);

        emailLabel = questionInstance(EmailLabel.class);
    }

    @Test
    public void userOpenApplication() {
        givenThat(actor)
                .attemptsTo(openBrowser);

        then(actor).should(
                seeThat(headerTitle, is("Login")),
                seeThat(emailLabel, is("Email"))
        );
    }
}
