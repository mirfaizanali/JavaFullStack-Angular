package com.telusko;

public class Alien {

    private int age;
    private Hello hlo;

    public Alien(){
        System.out.println("Alien Object Created");
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;

    }

    public Hello getHlo() {
        return hlo;
    }

    public void setHlo(Hello hlo) {
        this.hlo = hlo;
    }

    public void code(){
        System.out.println("Coding");
        hlo.sayHello();
    }
}
