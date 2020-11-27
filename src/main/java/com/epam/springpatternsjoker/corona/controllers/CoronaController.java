package com.epam.springpatternsjoker.corona.controllers;

import com.epam.springpatternsjoker.corona.model.PatientStatus;
import com.epam.springpatternsjoker.corona.services.Hospital;
import com.epam.springpatternsjoker.corona.services.PSRService;
import com.naya.corona.legacy.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static java.time.LocalDateTime.now;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/corona/")
public class CoronaController {
    private final Hospital hospital;
    private final PSRService diagnosticService;

    @PostMapping("treat")
    public Patient treat(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }








    @GetMapping("diagnose")
    public PatientStatus getPatientStatus(@PathVariable String name){
        return new PatientStatus(diagnosticService.isPositive(),now());
    }



}
