package com.example.android.inclassassignment11_jingshanw;

/**
 * Created by Jing on 4/17/17.
 */

public class Person {
    public String id;
    public String name;
    public int age;
    public boolean alive;


    public Person() {}


    public Person(String id, String name, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.alive = alive;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}




