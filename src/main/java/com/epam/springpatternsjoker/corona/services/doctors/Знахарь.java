package com.epam.springpatternsjoker.corona.services.doctors;

import com.epam.springpatternsjoker.corona.services.treatments.Банки;
import com.epam.springpatternsjoker.corona.services.treatments.Баня;
import com.epam.springpatternsjoker.corona.services.treatments.Водка;
import com.epam.springpatternsjoker.corona.services.treatments.Чеснок;
import com.epam.springpatternsjokerstarter.InjectList;
import com.naya.corona.legacy.model.Patient;
import com.naya.corona.legacy.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component(Целитель.НАРОДНАЯ)
public class Знахарь implements Целитель {






    @InjectList({Водка.class, Баня.class, Банки.class, Чеснок.class})
    private List<Лечение> лечениеs;

    @Override
    public void исцелять(Patient patient) {
        System.out.println("определяю лечение...");
        лечениеs.forEach(лечение -> лечение.применить(patient));
    }

    @Override
    public String myType() {
        return "folk";
    }
}
