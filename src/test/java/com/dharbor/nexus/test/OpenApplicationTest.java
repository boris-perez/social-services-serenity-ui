package com.dharbor.nexus.test;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import com.dharbor.nexus.application.components.login.*;
import net.serenitybdd.screenplay.Actor;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

/**
 * @author Ivan Alban
 */
public class OpenApplicationTest extends AbstractTest {

    private Actor actor = Actor.named("ivan");

    private OpenBrowser openBrowser;

    private TheHeaderTitle theHeaderTitle;

    private TheEmailLabel theEmailLabel;

    private ThePasswordLabel thePasswordLabel;

    private TheLoginButtonExists theLoginButtonExists;

    private TheEmailInputExists theEmailInputExists;

    private ThePasswordInputExists thePasswordInputExists;

    @Before
    public void setup() {
        initializeActor(actor);

        openBrowser = taskInstance(OpenBrowser.class);

        theHeaderTitle = questionInstance(TheHeaderTitle.class);

        theEmailLabel = questionInstance(TheEmailLabel.class);

        thePasswordLabel = questionInstance(ThePasswordLabel.class);

        theLoginButtonExists = questionInstance(TheLoginButtonExists.class);

        theEmailInputExists = questionInstance(TheEmailInputExists.class);

        thePasswordInputExists = questionInstance(ThePasswordInputExists.class);
    }

    @Test
    public void userOpenApplication() {
        givenThat(actor)
                .attemptsTo(openBrowser);

        then(actor).should(
                seeThat(theHeaderTitle, is("Login")),
                seeThat(theEmailLabel, is("Email")),
                seeThat(thePasswordLabel, is("Password")),
                seeThat(theEmailInputExists),
                seeThat(thePasswordInputExists),
                seeThat(theLoginButtonExists)
        );
    }
}
