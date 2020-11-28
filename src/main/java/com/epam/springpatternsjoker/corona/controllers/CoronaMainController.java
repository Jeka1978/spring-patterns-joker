package com.epam.springpatternsjoker.corona.controllers;

import com.epam.springpatternsjoker.corona.model.PatientStatus;
import com.epam.springpatternsjoker.corona.services.Hospital;
import com.epam.springpatternsjoker.corona.psr.PSRService;
import com.epam.springpatternsjokerstarter.CoronaController;
import com.naya.corona.legacy.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static java.time.LocalDateTime.now;

/**
 * @author Evgeny Borisov
 */
@CoronaController
@RequiredArgsConstructor
@RequestMapping("/corona/")
public class CoronaMainController {
    private final Hospital hospital;
    private final PSRService diagnosticService;

    @PostMapping("treat")
    public Patient treat(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }








    @GetMapping("diagnose")
    public PatientStatus getPatientStatus(){
        return new PatientStatus(diagnosticService.isPositive(),now());
    }



}
