package com.dharbor.nexus.application.components.login;

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
 * @author Ivan Alban
 */
@PrototypeScope
class LoginComponent {

    @Getter
    private Target emailInput;

    @Getter
    private Target passwordInput;

    @Getter
    private Target loginButton;

    @Getter
    private Target BusinessInformation;

    Performable enterEmailValue(String value) {
        return Enter.theValue(value).into(emailInput).thenHit(Keys.TAB);
    }

    Performable enterPasswordValue(String value) {
        return Enter.theValue(value).into(passwordInput).thenHit(Keys.TAB);
    }

    Performable pushLoginButton() {
        return Click.on(loginButton);
    }

    Performable pushBusnessInformation() {
        return Click.on(BusinessInformation);
    }

    @PostConstruct
    void onPostConstruct() {

        emailInput = Target.the(ConstantsLogin.TARGET_EMAIL_INPUT).located(By.id(ConstantsLogin.USERNAME_FIELD));

        passwordInput = Target.the(ConstantsLogin.TARGET_PASSWORD_INPUT).located(By.id(ConstantsLogin.PASSWORD_FIELD));

        loginButton = Target.the(ConstantsLogin.TARGET_LOGIN_BUTTON).located(By.cssSelector(ConstantsLogin.SUBMIT_BUTTON));

        BusinessInformation = Target.the(ConstantsLogin.TARGET_BUSINESS_FIELD).located(By.id(ConstantsLogin.BUSINESS_INFORMATION));
    }
}
