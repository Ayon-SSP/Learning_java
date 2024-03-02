package org.training.learn.model;

public class AccessTest2 {
    private int num;
    private String name;

    // create a constructor to display the name and num
    public AccessTest2(int num) {
        this.num = num;
        System.out.println("Num: " + num + " Name: " + name);
    }
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
