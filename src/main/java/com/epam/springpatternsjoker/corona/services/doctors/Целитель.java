package com.epam.springpatternsjoker.corona.services.doctors;


import com.naya.corona.legacy.model.Patient;

/**
 * @author Evgeny Borisov
 */
public interface Целитель {
    void исцелять(Patient patient);

    String ТРАДИЦИОННАЯ = "traditional";
    String НАРОДНАЯ = "folk";
}
