package com.epam.springpatternsjoker.corona.services.doctors;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class Священник implements Целитель {
    @Autowired
    List<Лечение> устаревшиеМетоды;

    @Override
    public void исцелять(Patient patient) {
        устаревшиеМетоды.forEach(лечение -> лечение.применить(patient));
    }
}
