package com.dharbor.nexus.application.components.login;

import com.dharbor.nexus.application.framework.context.PrototypeScope;
import lombok.Getter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

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

    private Target emailInput;

    private Target passwordLabel;

    private Target passwordInput;

    private Target loginButton;

    private Target createAccountLink;

    @PostConstruct
    void onPostConstruct() {
        headerTitle = Target.the("Login Form Title").located(By.className("cc-ui-form__title"));

        emailLabel = Target.the("Email Label").located(By.xpath(".//label[@for='username']"));
    }
}
