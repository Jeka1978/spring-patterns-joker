package com.epam.springpatternsjoker.corona.services.treatments;


import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;

/**
 * @author Evgeny Borisov
 */
@Treatment(type = Лечение.АЛКОГОЛЬ)
public class Коньяк implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Дышать над коньячными парами в течении часа 4 раза в день перед сном");
    }
}
