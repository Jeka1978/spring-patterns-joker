package com.epam.springpatternsjoker.corona.services.treatments;

import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Иглоукалывание implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Втыкать иголки на глубину 2 милитра по всему позвоночнику, через полчаса звонить в скорую");
    }
}
