package com.epam.springpatternsjoker.corona.services.doctors;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class Врач implements Целитель {
    @Autowired
    private List<Лечение> лечениеs;

    private int currentЛечение;

    @Override
    public void исцелять(Patient patient) {
        if (currentЛечение == лечениеs.size()) {
            currentЛечение = 0;
        }
        Лечение лечение = лечениеs.get(currentЛечение++);
        System.out.println("сегодня попробуем: "+лечение.getClass().getSimpleName());
        лечение.применить(patient);
    }
}
