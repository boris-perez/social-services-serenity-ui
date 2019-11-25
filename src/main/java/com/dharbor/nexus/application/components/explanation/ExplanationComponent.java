package com.dharbor.nexus.application.components.explanation;

import com.dharbor.nexus.application.framework.context.PrototypeScope;
import lombok.Getter;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.annotation.PostConstruct;

/**
 * @author Boris Perez
 */
@PrototypeScope
class ExplanationComponent {

    @Getter
    private Target explanationField;

    @Getter
    private Target explanationIcon;

    @Getter
    private Target explanationNew;

    @Getter
    private Target explanationContent;

    @Getter
    private Target explanationCancel;

    @Getter
    private Target explanationSave;

    @Getter
    private Target explanationEdit;

    @Getter
    private Target explanationDelete;

    @Getter
    private Target explanationPrevious;

    @Getter
    private Target explanationNext;

    @Getter
    private Target lucyAlert;

    @Getter
    private Target lucyAlertClose;

    @Getter
    private Target explanationTitle;


    Performable pushExplanationField() {
        return Click.on(explanationField);
    }

    Performable pushLucyAlertClose() {
        return Click.on(lucyAlertClose);
    }

    Performable pushLucyAlert() {
        return Click.on(lucyAlert);
    }

    Performable pushExplanationIcon() {
        return Click.on(explanationIcon);
    }

    Performable pushExplanationNew() {
        return Click.on(explanationNew);
    }

    Performable pushExplanationSave() {
        return Click.on(explanationSave);
    }

    Performable pushExplanationDelete() {
        return Click.on(explanationDelete);
    }

    Performable pushExplanationEdit() {
        return Click.on(explanationEdit);
    }

    Performable pushExplanationCancel() {
        return Click.on(explanationCancel);
    }

    Performable pushExplanationNext() {
        return Click.on(explanationNext);
    }

    Performable pushExplanationPrevious() {
        return Click.on(explanationPrevious);
    }

    Performable pushExplanationTitle() {
        return Click.on(explanationTitle);
    }

    Performable enterExplanationContent(String value) {
        return Enter.theValue(value).into(explanationContent).thenHit(Keys.TAB);
    }

    @PostConstruct
    void onPostConstruct() {

        explanationField = Target.the(ExplanationConstant.FIRST_FIELD).located(By.id(ExplanationConstant.FIRST_FIELD));
        explanationIcon = Target.the(ExplanationConstant.EXPLANATION_ICON).located(By.id(ExplanationConstant.EXPLANATION_ICON));
        explanationNew = Target.the(ExplanationConstant.EXPLANATION_NEW).located(By.id(ExplanationConstant.EXPLANATION_NEW));
        explanationContent = Target.the(ExplanationConstant.EXPLANATION_CONTENT).located(By.id(ExplanationConstant.EXPLANATION_CONTENT));
        explanationCancel = Target.the(ExplanationConstant.EXPLANATION_CANCEL).located(By.id(ExplanationConstant.EXPLANATION_CANCEL));
        explanationSave = Target.the(ExplanationConstant.EXPLANATION_SAVE).located(By.id(ExplanationConstant.EXPLANATION_SAVE));
        explanationEdit = Target.the(ExplanationConstant.EXPLANATION_EDIT).located(By.id(ExplanationConstant.EXPLANATION_EDIT));
        explanationDelete = Target.the(ExplanationConstant.EXPLANATION_DELETE).located(By.id(ExplanationConstant.EXPLANATION_DELETE));
        explanationPrevious = Target.the(ExplanationConstant.EXPLANATION_PREVIOUS).located(By.id(ExplanationConstant.EXPLANATION_PREVIOUS));
        explanationNext = Target.the(ExplanationConstant.EXPLANATION_NEXT).located(By.id(ExplanationConstant.EXPLANATION_NEXT));
        explanationTitle = Target.the(ExplanationConstant.EXPLANATION_TITLE).located(By.id(ExplanationConstant.EXPLANATION_TITLE));
        lucyAlert = Target.the(ExplanationConstant.ALERT).located(By.cssSelector(ExplanationConstant.LUCY_ALERT));
        lucyAlertClose = Target.the(ExplanationConstant.LUCY_ALERT_CLOSE).located(By.id(ExplanationConstant.LUCY_ALERT_CLOSE));
    }
}
