package com.dharbor.set.application.components.documents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Boris Perez
 */
public class DocumentTitlePanel implements Question<String> {

    @Autowired
    private DocumentsComponent component;

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(component.getDocumentPanelTitle()).viewedBy(actor).resolve();
    }
}
