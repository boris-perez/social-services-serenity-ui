package com.dharbor.nexus.application.components.explanation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ExplanationSelectExplanationOption implements Task {


    @Autowired
    private ExplanationComponent component;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                component.pushExplanationField(),
                component.pushExplanationIcon()
        );
    }
}
