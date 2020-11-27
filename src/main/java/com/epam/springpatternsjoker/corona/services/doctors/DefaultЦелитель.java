package com.epam.springpatternsjoker.corona.services.doctors;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class DefaultЦелитель implements Целитель {
    @Autowired
    private List<Лечение> всеЛечения;

    private Random random = new Random();

    @Override
    public void исцелять(Patient patient) {
        всеЛечения.get(random.nextInt(всеЛечения.size())).применить(patient);
    }
}
