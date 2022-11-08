package com.kodilla.bytecode.reflection.task;

import java.lang.reflect.Field;

public class ReflectionTestStudent {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student = new Student();
        System.out.println("Student index number from getter: " + student.getIndexNumber());

        Field indexNumberField = Student.class.getDeclaredField("indexNumber");
        indexNumberField.setAccessible(true);

        String value = (String) indexNumberField.get(student);
        System.out.println("Student index number from reflection API: " + value);

    }
}
