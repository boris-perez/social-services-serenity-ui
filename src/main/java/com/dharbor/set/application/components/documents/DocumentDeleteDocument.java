package com.dharbor.set.application.components.documents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.springframework.beans.factory.annotation.Autowired;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * @author Boris Perez
 */
public class DocumentDeleteDocument implements Task {


    @Autowired
    private DocumentsComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(component.getDocumentDelete(), isVisible()).forNoMoreThan(15).seconds(),
                MoveMouse.to(component.getDocumentDelete()),
                component.pushDocumentDelete(),
                component.pushDocumentDeleteNo(),
                WaitUntil.the(component.getDocumentDelete(), isVisible()).forNoMoreThan(15).seconds(),
                component.pushDocumentDelete()
        );
    }
}
