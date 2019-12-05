package com.dharbor.set.application.components.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ivan Alban
 */
public class ThePasswordInputExists implements Question<Boolean> {

    @Autowired
    private LoginComponent component;

    @Override
    public Boolean answeredBy(Actor actor) {
        return Presence.of(component.getPasswordInput()).viewedBy(actor).resolve();
    }
}