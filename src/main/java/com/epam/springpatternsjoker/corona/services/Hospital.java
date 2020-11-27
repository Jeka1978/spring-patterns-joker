package com.epam.springpatternsjoker.corona.services;


import com.naya.corona.legacy.model.Patient;

/**
 * @author Evgeny Borisov
 */
public interface Hospital {
    void processPatient(Patient patient);
}
