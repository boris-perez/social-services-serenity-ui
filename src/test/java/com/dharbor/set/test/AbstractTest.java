package com.dharbor.set.test;

import com.dharbor.set.application.framework.serenitybdd.QuestionFactory;
import com.dharbor.set.application.framework.serenitybdd.TaskFactory;
import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Ivan Alban
 */
@RunWith(SpringIntegrationSerenityRunner.class)
@ContextConfiguration(
        classes = {com.dharbor.set.application.Config.class}
)
public abstract class AbstractTest {

    @Managed(driver = "chrome", uniqueSession = true)
    private WebDriver webDriver;

    @Autowired
    private TaskFactory taskFactory;

    @Autowired
    private QuestionFactory questionFactory;

    @BeforeClass
    public static void onBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "");
    }

    protected void initializeActor(Actor actor) {
        actor.can(BrowseTheWeb.with(webDriver));
    }

    protected <T extends Task> T taskInstance(Class<T> clazz) {
        return taskFactory.create(clazz);
    }

    protected <T extends Question> T questionInstance(Class<T> clazz) {
        return questionFactory.create(clazz);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void fullScreen() {
        webDriver.manage().window().maximize();
    }
}
