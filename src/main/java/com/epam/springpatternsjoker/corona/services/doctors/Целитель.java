package com.epam.springpatternsjoker.corona.services.doctors;


import com.epam.springpatternsjoker.corona.services.Hospital;
import com.naya.corona.legacy.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */


public interface Целитель {
    void исцелять(Patient patient);


    @Autowired
    default void regMe(Hospital hospital){
        hospital.register(myType(),this);
    }

    String myType();

    String ТРАДИЦИОННАЯ = "traditional";
    String НАРОДНАЯ = "folk";
}
