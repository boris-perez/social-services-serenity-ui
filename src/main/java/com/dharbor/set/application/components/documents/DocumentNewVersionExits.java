package com.dharbor.set.application.components.documents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class DocumentNewVersionExits implements Question<Boolean> {

    @Autowired
    private DocumentsComponent component;

    @Override
    public Boolean answeredBy(Actor actor) {
        return Presence.of(component.getDocumentVersionNew()).viewedBy(actor).resolve();
    }

}
