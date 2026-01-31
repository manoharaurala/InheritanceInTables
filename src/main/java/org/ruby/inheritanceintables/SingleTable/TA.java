package org.ruby.inheritanceintables.SingleTable;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "TA")
public class TA extends User {
    private Integer helpRequests;
}
