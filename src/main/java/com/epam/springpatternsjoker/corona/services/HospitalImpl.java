package com.epam.springpatternsjoker.corona.services;

import com.epam.springpatternsjoker.corona.services.doctors.DefaultЦелитель;
import com.epam.springpatternsjoker.corona.services.doctors.Целитель;
import com.naya.corona.legacy.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class HospitalImpl implements Hospital {



    private Map<String, Целитель> map = new HashMap<>();


    @Override
    public void register(String type, Целитель целитель) {
        map.put(type, целитель);
    }

    @Override
    public void processPatient(Patient patient) {
        Целитель целитель = map.getOrDefault(patient.getMethod(), new DefaultЦелитель());
        целитель.исцелять(patient);

    }
}
