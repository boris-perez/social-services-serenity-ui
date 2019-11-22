package com.dharbor.nexus.application.components.explanation;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ivan Alban
 */
public class ExplanationDelete implements Task {

    @Setter
    private String email;

    @Setter
    private String password;

    @Autowired
    private ExplanationComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.pushExplanationDelete()
        );
    }
}
