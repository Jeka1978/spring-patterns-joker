package com.epam.springpatternsjoker.corona.services.treatments;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Аспирин implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Принимать аспирин три раза в день после еды");
    }
}
