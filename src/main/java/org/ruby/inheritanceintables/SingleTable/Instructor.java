package org.ruby.inheritanceintables.SingleTable;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "INSTRUCTOR")
public class Instructor extends User {
    private Double rating;
}
