package com.epam.springpatternsjoker.corona.services;

import com.epam.springpatternsjoker.corona.services.doctors.*;
import com.naya.corona.legacy.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class HospitalImpl implements Hospital {
    @Autowired
    private Знахарь знахарь;
    @Autowired
    private Врач врач;
    @Autowired
    private DefaultЦелитель defaultЦелитель;

    @Override
    public void processPatient(Patient patient) {
        switch (patient.getMethod()) {
            case Целитель.ТРАДИЦИОННАЯ:
                врач.исцелять(patient);
                break;
            case Целитель.НАРОДНАЯ:
                знахарь.исцелять(patient);
                break;
            default:
                defaultЦелитель.исцелять(patient);
        }
    }
}
