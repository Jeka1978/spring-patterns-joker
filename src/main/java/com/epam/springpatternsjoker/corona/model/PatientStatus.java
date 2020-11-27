package com.epam.springpatternsjoker.corona.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * @author Evgeny Borisov
 */
@Value
@AllArgsConstructor
public class PatientStatus {
    Boolean positive;
    LocalDateTime when;

}
