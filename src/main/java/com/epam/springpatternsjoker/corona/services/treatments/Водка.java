package com.epam.springpatternsjoker.corona.services.treatments;


import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;

/**
 * @author Evgeny Borisov
 */

@Treatment(type = Лечение.АЛКОГОЛЬ)
public class Водка implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("100 грамм водки внутрь, три раза перед каждой едой");
    }
}
