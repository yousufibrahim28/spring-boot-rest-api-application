# spring-boot-rest-api-application
spring-boot-rest-api-application Spring Boot course works tutorial

Spring Boot notes

When creating a Spring project we need to take care of following which is not easy.

- Dependency management - we have to manage frameworks and version. (pom.xml)
- Web.xml management - In the case of spring MVC, eg: we have to configure  DispatcherServelet for Spring MVC (web.xml)
- Spring Configuration management - Component Scan, View Resolver (context.xml)
- NFRs, - Non Functional requirements have to be manually implemented

We will have to repeat this for every project we create. It takes a lot of time.




Spring boot works only with Java 17 and above


Install this chrome extension to view formatted json

https://chrome.google.com/webstore/detail/json-formatter/bcjindcccaagfpapjjmafapmmgkkhgoa


An important goal of spring boot

- Help you build Production ready apps Quickly
    - Building Quickly
        - Spring Initialiser
        - Spring Boot Starter Projects
        - Spring Boot Auto Configuration
        - Spring Boot DevTools
    - Production ready
        - Logging
        - Different Configuration for Different Environments
            - Profiles,ConfigurationProperties
        - Monitoring(Spring Boot Actuator)

Spring Initailizr - https://start.spring.io/

Spring Boot starter projects

- We need a lot of frameworks to build application features:
    - Build a REST API: I need Spring, Spring MVC, Tomcat, JSON Conversion etc.
    - Write Unit Tests: 1 need Spring Test, Unit, Mockito etc..
- How can I group them and make it easy to build applications?
    - Starters: Convenient dependency descriptors for different features
- Spring Boot provides variety of starter projects
    - Web Application & REST API - Spring Boot Starter Web (Spring-webmvc,spring-web, spring-boot-starter-tomcat, spring-boot-starter-json)
    - Unit Tests - Spring Boot Starter Test
    - Talk to database using JPA - Spring Boot Starter Data JPA
    - Talk to databases using JDBC - Spring Boot Starter JDBC
    - Secure your web application or REST API - Spring Boot Starter Security

Spring boot Auto Configuration - Auto configures a lot of necessary things like error handling logging etc. based on the frameworks in our class path.

Springbootautocongiure.jar - all logic for auto configuration is present in this jar.

- We need lot of configuration to build Spring app:
    - Component Scan, DispatcherServelet, Data Sources, JSON Conversion,…
- How can I Simply this?
    - Auto Configuration: Automated configuration for your app
        - Decided based on:
            - Which frameworks are in the class Path?
            - What is the existing configuration (Annotations etc)
- Example: Spring Boot Starter Web
    - Dispatcher Servlet (DispatcherServletAutoConfiguration)
    - Embedded Servlet Container - Tomcat is the default(EmbeddedWebServerFactoryCustomizerAutoConfiguration)
    - Default Error Pages (ErrorMvcAutoConfoguration)
    - Bean<->JSON (JacksonHttpMessageConverterConfiguration)

Spring Boot Dev Tools

- Increase developer Productivity
- Why do you need to restart the server manually for every code change?
- Any Java changes and property file changes are picked up immediately
- Any changes made to pom.xml the server has to be restarted

