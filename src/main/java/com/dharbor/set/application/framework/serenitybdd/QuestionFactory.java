package com.dharbor.set.application.framework.serenitybdd;

import net.serenitybdd.screenplay.Question;
import org.springframework.beans.BeanUtils;

/**
 * @author Ivan Alban
 */
public abstract class QuestionFactory extends BaseFactory {

    public <T extends Question> T create(Class<T> clazz) {
        T instance = BeanUtils.instantiateClass(clazz);

        injectAutowired(instance);

        return instance;
    }
}
