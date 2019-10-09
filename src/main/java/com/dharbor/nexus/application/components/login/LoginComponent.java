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
    private Target headerTitle;

    @Getter
    private Target emailLabel;

    @Getter
    private Target emailInput;

    @Getter
    private Target passwordLabel;

    @Getter
    private Target passwordInput;

    @Getter
    private Target loginButton;

    Performable enterEmailValue(String value) {
        return Enter.theValue(value).into(emailInput).thenHit(Keys.TAB);
    }

    Performable enterPasswordValue(String value) {
        return Enter.theValue(value).into(passwordInput).thenHit(Keys.TAB);
    }

    Performable pushLoginButton() {
        return Click.on(loginButton);
    }

    @PostConstruct
    void onPostConstruct() {
        headerTitle = Target.the("Form title").located(By.className("cc-ui-form__title"));

        emailLabel = Target.the("Email label").located(By.xpath(".//label[@for='username']"));

        emailInput = Target.the("Email input").located(By.xpath(".//input[@type='text' and @id='username']"));

        passwordLabel = Target.the("Password label").located(By.xpath(".//label[@for='password']"));

        passwordInput = Target.the("Password input").located(By.xpath(".//input[@type='password' and @id='password']"));

        loginButton = Target.the("Login button").located(By.xpath(".//button[@type='submit']"));
    }
}
