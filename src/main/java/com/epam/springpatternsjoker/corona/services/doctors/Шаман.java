package com.epam.springpatternsjoker.corona.services.doctors;

import com.naya.corona.legacy.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Шаман implements Целитель {

    @Override
    public void исцелять(Patient patient) {
        System.out.println("бей в бубен громче!!!");
    }

    @Override
    public String myType() {
        return "магия";
    }
}
