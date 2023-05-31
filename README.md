# spring-boot-rest-api-application
spring-boot-rest-api-application Spring Boot course works tutorial

**Spring Boot notes**

When creating a Spring project we need to take care of following which is not easy.

- Dependency management - we have to manage frameworks and version. (pom.xml)
- Web.xml management - In the case of spring MVC, eg: we have to configure  DispatcherServelet for Spring MVC (web.xml)
- Spring Configuration management - Component Scan, View Resolver (context.xml)
- NFRs, - Non Functional requirements have to be manually implemented

We will have to repeat this for every project we create. It takes a lot of time.

Spring boot works only with Java 17 and above

Install this chrome extension to view formatted json

https://chrome.google.com/webstore/detail/json-formatter/bcjindcccaagfpapjjmafapmmgkkhgoa


**An important goal of spring boot**

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

**Spring Initailizr - https://start.spring.io/**

**Spring Boot starter projects**

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

**Spring boot Auto Configuration - Auto configures a lot of necessary things like error handling logging etc. based on the frameworks in our class path.**

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

**Spring Boot Dev Tools**

- Increase developer Productivity
- Why do you need to restart the server manually for every code change?
- Any Java changes and property file changes are picked up immediately
- Any changes made to pom.xml the server has to be restarted


**Managing Application configuration using profiles**

- Applications have different environments: Dev, QA, Stage and Prod
- Different environments need different configuration:
    - Different Databases
    - Different Web Services

- Profile enables you to provide environment-specific configurations
    - Eg: Logging configuration different for prod dev and QA environments
        - Trace - Prints everything
        - Debug - Prints Debug level and others below it
        - Info - Prints Info level and others below it
        - Warning - Prints Warning level and others below it
        - Error - Prints only errors and exception
        - Off - completely turns off logging
    - We can use @ConfigurationProperties(prefix = "currency-service") to pick properties from application.properties and make code flow run based on the configuration
    - Application.properties and @ConfigurationProperties are great combination to trigger different logic and code flows for different environments and different requirements

**Simplify Deployment with Spring Boot Embedded Servers**

- How to deploy your application
    - Old approach (WAR file)
        - Install Java
        - Install webb/Apllication Server
            - Tomcat/Websphere/weblogic etc.
        - Deploy the application WAR (Web ARchive)
            - This is the OLD WAR Approach
            - Complex to Setup

    - New Embedded Server Approach - Simpler alternative, the Server will be packed in the JAR file along with the application code
        - Step 1: Install Java
        - Step 2 ]: Run JAR file
        - No need to install web server, because it will be part of our JAR, since spring-boot-starter-tomcat will be coming in the Spring Web starter pack.
        - Supported embedded server in spring boot
            - Spring-boot-starter-tomcat
            - Spring-boot-starter-jetty
            - Spring-boot starter-undertow

**To run a Jar file**

- Run the command ‘mv clean install’
- Fetch the Jar file name and location that will be printed
- /Users/yousuf/.m2/repository/com/yousufibrahim28/spring-boot-rest-api-application/0.0.1-SNAPSHOT/spring-boot-rest-api-application-0.0.1-SNAPSHOT.jar
- Cd in to the path
- Run command - java -jar ‘Jar-File-name’ eg : java -jar spring-boot-rest-api-application-0.0.1-SNAPSHOT.jar
- Now the application will be launched.
- Remember Spring boot 3 works only on Java 17 and above.


**Spring Boot Actuator for Monitoring applications - production-ready app requirement.**

- Monitor and Manage your application in your production
- Provides number of end-points
    - Beans - Complete list of spring beans in your app
    - Health - application health information
    - Metrics - Application metrics
    - Mappings - Details around Request Mappings

Use http://localhost:8080/actuator - to view all the endpoints available

Add this “management.endpoints.web.exposure.include=*” in application.properties files to enable all the actuator endpoints. This would not be done because enabling all the endpoint consumes CPU and memory instead enable only what we need.

Eg: management.endpoints.web.exposure.include=health,metrics




**Spring Boot vs Spring MVC vs Spring**

- Spring Framework: Dependency Injection is the core
    - @Component, @autowired, @Component Scan etc..
    - Just Dependency injection is NOT sufficient (You need other frameworks to build apps)
        - Spring Modules and Spring projects: Extend Spring Eco System
            - Provide good integration with other frameworks(Hibernate/JPA, JUnit and Mockito for unit testing)
- Spring MVC(Spring Module) : Simplifies building web apps and REST API
    - Building web application with struts was very complex
    - @Controller, @RestController, @RequestMapping(“/courses”)

- Spring Boot (Spring Project) : Build Production-ready apps Quickly
    - Starter projects - make it easy to build variety of applications
    - Auto configuration - Eliminate configuration to setup Spring,Spring MVC and other Frameworks
    - Enable non Functional requirements (NFRs):
        - Actuator:  Enables Advanced Monitoring of application
        - Embedded Server: No need for separate application servers!
        - Logging and Error Handling
        - Profiles and ConfigurationProperties

@SpringBootApplication annotation is a combination of 3 annotations: @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan


Spring Boot Actuator: Monitor and manage your application in your production. It provides a number of endpoints: 1) beans - Complete list of Spring beans in your app 2) health - Application health information 3) metrics - Application metrics 4) mappings - Details around Request Mappings



