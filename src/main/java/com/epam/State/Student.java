package com.epam.State;

public class Student {
    private String name;
    private int age;
    private GrantOrder grantOrder;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void createGrantOrder(){
        grantOrder = new GrantOrder(this);
    }
}
