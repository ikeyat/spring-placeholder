# spring-placeholder
## Overview
This sample program shows how to get string replaced with props, system props and environment variables just like Spring Framework does.
## How to try
This sample includes exec task in pom.xml. Type following commands after you checkout this.
```shell-session
mvn install
mvn exec:exec
```
See INFO log on stdout then you can find replaced strings and not replaced strings because their keys does not exist.
* prop.key1
 * Its definition is in properties file that is set as placeholder in ApplicationContext.xml.
* sysprop.key1
 * It is defined as JVM parameter. (The definition is exec task in pom.xml)
* ENV_KEY1
 * It is defined as environment variable. (The definition is exec task in pom.xml).

## References
* Javadoc
 * http://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/ConfigurableBeanFactory.html
 * http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/beans/factory/config/PropertyPlaceholderConfigurer.html
* Technics 
 * http://stackoverflow.com/questions/1771166/access-properties-file-programatically-with-spring
 * http://maciej-miklas.blogspot.de/2013/07/spring-31-programmatic-access-to.html
