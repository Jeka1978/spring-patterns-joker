package com.epam.springpatternsjoker.corona.services;


import com.epam.springpatternsjoker.corona.services.doctors.Целитель;
import com.naya.corona.legacy.model.Patient;

/**
 * @author Evgeny Borisov
 */
public interface Hospital {
    void register(String type, Целитель целитель);

    void processPatient(Patient patient);
}
