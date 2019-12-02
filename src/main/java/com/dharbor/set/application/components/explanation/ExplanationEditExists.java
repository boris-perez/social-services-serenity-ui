package com.dharbor.set.application.components.explanation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ExplanationEditExists implements Question<Boolean> {

    @Autowired
    private ExplanationComponent component;

    @Override
    public Boolean answeredBy(Actor actor) {
        return Presence.of(component.getExplanationEdit()).viewedBy(actor).resolve();
    }

}
