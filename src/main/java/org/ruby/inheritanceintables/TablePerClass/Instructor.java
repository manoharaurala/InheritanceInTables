package org.ruby.inheritanceintables.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_instructors")
public class Instructor extends User {
    private Double rating;
}
