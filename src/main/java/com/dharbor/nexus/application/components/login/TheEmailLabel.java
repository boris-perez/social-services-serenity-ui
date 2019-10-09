package com.dharbor.nexus.application.components.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ivan Alban
 */
public class TheEmailLabel implements Question<String> {

    @Autowired
    private LoginComponent component;

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(component.getEmailLabel()).viewedBy(actor).resolve().trim();
    }
}
