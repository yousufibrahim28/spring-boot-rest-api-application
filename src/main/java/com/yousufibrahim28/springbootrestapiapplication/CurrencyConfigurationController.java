package com.yousufibrahim28.springbootrestapiapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation is used to create a Rest controller
@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    // This annotation maps the request to the url path
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return currencyServiceConfiguration;
    }
}
