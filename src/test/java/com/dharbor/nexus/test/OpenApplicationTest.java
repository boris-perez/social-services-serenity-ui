package com.dharbor.nexus.test;

import com.dharbor.nexus.application.components.browser.OpenBrowser;
import net.serenitybdd.screenplay.Actor;
import org.junit.Before;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

/**
 * @author Ivan Alban
 */
public class OpenApplicationTest extends AbstractTest {

    private Actor actor = Actor.named("ivan");

    private OpenBrowser openBrowser;

    @Before
    public void setup() {
        initializeActor(actor);

        openBrowser = taskInstance(OpenBrowser.class);
    }

    @Test
    public void userOpenApplication() {
        givenThat(actor)
                .attemptsTo(openBrowser);
    }
}
