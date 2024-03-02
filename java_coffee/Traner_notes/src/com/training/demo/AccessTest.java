package com.training.demo;

public class AccessTest {

    private int num;
    private String name;
    // private vals => access via getters and setters(accessors and mutators)
    // generate setters/getters(alt + s + r) || To import the package(ctrl + shift + o)
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
