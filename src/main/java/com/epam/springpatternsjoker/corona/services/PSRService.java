package com.epam.springpatternsjoker.corona.services;

import com.epam.springpatternsjoker.corona.model.Papaya;
import com.epam.springpatternsjoker.corona.services.doctors.Целитель;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.naya.corona.legacy.model.Patient;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class PSRService {

    private List<?> answer = List.of("true", "false", new Papaya());
    private int position;

    public boolean isPositive() {
        if (position == answer.size()) {
            position=0;
        }
        System.out.println(position);
        String s = (String) answer.get(position++);
        System.out.println(s);
        return Boolean.parseBoolean(s);
    }


}
