package com.example.placeholdersample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ikeya on 15/03/22.
 */
public class PlaceholderExample {
    private static final Logger logger = LoggerFactory.getLogger(PlaceholderExample.class);

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
    }
}