package com.epam.springpatternsjoker.corona.services.treatments;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Чеснок implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Вставить ческнок в ущи, нос и рот, крутить по часовой стрелке во время еды, до конца пандемии");
    }
}
