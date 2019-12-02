package com.dharbor.set.application.components.browser;

import com.dharbor.set.application.config.ApplicationConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ivan Alban
 */
public class OpenBrowser implements Task {

    @Autowired
    private ApplicationConfig config;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(config.getUrl()));
    }
}
