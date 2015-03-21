package com.example.placeholdersample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Created by ikeya on 15/03/22.
 */
public class PropertyPlaceholderAccessor implements BeanFactoryAware {
    private static final Logger logger = LoggerFactory.getLogger(PropertyPlaceholderAccessor.class);

    private BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public String convert(String original) {
        String ret = original;
        if (beanFactory instanceof ConfigurableBeanFactory) {
            ConfigurableBeanFactory configurableBeanFactory = (ConfigurableBeanFactory) beanFactory;
            try {
                ret = configurableBeanFactory.resolveEmbeddedValue(original);
            } catch (IllegalArgumentException e) {
                // ignore
                logger.info("ignore exception", e);
            }
        }
        return ret;
    }
}
