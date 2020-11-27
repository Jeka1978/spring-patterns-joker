package com.epam.springpatternsjoker.corona.services.treatments;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Амулет implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Носить на шее маску. Не снимать ни в душе ни во сне");
    }
}
