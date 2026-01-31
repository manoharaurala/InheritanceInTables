package org.ruby.inheritanceintables.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MENTOR")
public class Mentor extends User {
    private String company;
}
