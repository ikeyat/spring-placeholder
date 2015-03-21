package com.example.placeholdersample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ikeya on 15/03/22.
 */
public class PlaceholderExample {
    private static final Logger logger = LoggerFactory.getLogger(PlaceholderExample.class);

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/ApplicationContext.xml");

        PropertyPlaceholderAccessor accessor
                = context.getBean("propertyPlaceholderAccessor", PropertyPlaceholderAccessor.class);
        logger.info(accessor.convert("prop.key1=${prop.key1}"));
        logger.info(accessor.convert("prop.key2=${prop.key2}"));
        logger.info(accessor.convert("prop.key3=${prop.notfound}"));
        logger.info(accessor.convert("sysprop.key1=${sysprop.key1}"));
        logger.info(accessor.convert("sysprop.key2=${sysprop.key2}"));
        logger.info(accessor.convert("sysprop.key3=${sysprop.notfound}"));
        logger.info(accessor.convert("ENV_KEY1=${ENV_KEY1}"));
        logger.info(accessor.convert("ENV_KEY2=${ENV_KEY2}"));
        logger.info(accessor.convert("ENV_KEY3=${ENV_NOTFOUND}"));
    }
}
