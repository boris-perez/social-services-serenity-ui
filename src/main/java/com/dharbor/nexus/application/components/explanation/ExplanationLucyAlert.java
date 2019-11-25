package com.dharbor.nexus.application.components.explanation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ExplanationLucyAlert implements Question<String> {

    @Autowired
    private ExplanationComponent component;

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(component.getLucyAlert()).viewedBy(actor).resolve();
    }
}
