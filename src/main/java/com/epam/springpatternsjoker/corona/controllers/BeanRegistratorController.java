package com.epam.springpatternsjoker.corona.controllers;

import com.epam.springpatternsjoker.corona.infra.BeanMD;
import com.epam.springpatternsjoker.corona.infra.CCL;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

/**
 * @author Evgeny Borisov
 */
@RestController
public class BeanRegistratorController {

    @Autowired
    private GenericApplicationContext context;

    @Autowired
    private CCL ccl;


    @SneakyThrows
    @PostMapping("/regbean")
    public String regBean(@RequestBody BeanMD beanMD){


        return "registered";
    }






}
