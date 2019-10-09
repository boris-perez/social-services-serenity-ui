package com.dharbor.nexus.application.components.login;

import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ivan Alban
 */
public class InsertCredentialsAndLogin implements Task {

    @Setter
    private String email;

    @Setter
    private String password;

    @Autowired
    private LoginComponent component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                component.enterEmailValue(email),
                component.enterPasswordValue(password),
                component.pushLoginButton()
        );
    }
}
