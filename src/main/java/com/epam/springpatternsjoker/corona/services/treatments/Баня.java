package com.epam.springpatternsjoker.corona.services.treatments;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Баня implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("три захода в баню, по 10 минут при температуре в 3 раза превышающей температуру тела");
    }
}
