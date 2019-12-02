package com.dharbor.set.application.components.documents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class DocumentPaginationDocument implements Task {


    @Autowired
    private DocumentsComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(component.getDocumentPagination()),
                component.pushDocumentPagination(),
                MoveMouse.to(component.getDocumentNavigationNext()),
                component.pushDocumentNavigationNext(),
                component.pushDocumentNavigationPrevious()
        );
    }
}
