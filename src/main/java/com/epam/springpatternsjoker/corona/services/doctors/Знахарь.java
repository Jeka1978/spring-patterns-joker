package com.epam.springpatternsjoker.corona.services.doctors;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Знахарь implements Целитель {
    @Autowired
    private Лечение водка;

    @Override
    public void исцелять(Patient patient) {
        System.out.println("определяю лечение...");
        водка.применить(patient);
    }
}
