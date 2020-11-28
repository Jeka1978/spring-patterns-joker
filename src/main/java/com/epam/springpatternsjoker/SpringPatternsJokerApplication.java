package com.epam.springpatternsjoker;

import com.epam.springpatternsjoker.corona.services.doctors.Знахарь;
import com.epam.springpatternsjoker.corona.services.doctors.Священник;
import com.epam.springpatternsjoker.corona.services.doctors.Целитель;
import com.naya.corona.legacy.model.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPatternsJokerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringPatternsJokerApplication.class, args);

        context.getBean(Священник.class).исцелять(Patient.builder().build());
    }

}
