package com.dharbor.nexus.application.components.explanation;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class ExplanationFillExplanation implements Task {

    @Setter
    private String explanationContent;

    @Autowired
    private ExplanationComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                component.enterExplanationContent(explanationContent),
                component.pushExplanationSave(),
                MoveMouse.to(component.getExplanationContent())
        );
    }
}
