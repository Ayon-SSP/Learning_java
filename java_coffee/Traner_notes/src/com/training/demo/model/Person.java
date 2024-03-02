package com.training.demo.model;

public class Person {
    private int personId;
    private String personName;

    // generate a constructor
    public Person() {
        super();
        System.out.println("Person()");
    }

    public Person(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    // generate getters and setters for personId and personName
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public int getPersonId() {
        return personId;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public String getPersonName() {
        return personName;
    }

    // // override the toString() method in Person class
    @Override
    public String toString() {
        return "Person [personId=" + personId + ", personName=" + personName + "]";
    }


}
