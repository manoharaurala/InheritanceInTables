package org.ruby.inheritanceintables.SingleTable;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "MENTOR")
public class Mentor extends User {
    private String company;
}
