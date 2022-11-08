package com.kodilla.bytecode.reflection.task;

import org.apache.commons.lang3.RandomStringUtils;

public class Student {
    private String indexNumber;

    public Student() {
        this.indexNumber = RandomStringUtils.randomAlphanumeric(10);;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
