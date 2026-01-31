package org.ruby.inheritanceintables.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "INSTRUCTOR")
public class Instructor extends User {
    private Double rating;
}
