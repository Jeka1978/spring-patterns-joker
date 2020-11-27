package com.epam.springpatternsjoker.corona.services.treatments;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Банки implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("12 банок, присосать к спине на пол часа перед сном");
    }
}
