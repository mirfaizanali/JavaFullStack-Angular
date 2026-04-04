package com.in28minutes.rest.webservices.restful_web_services.HLO;

public class HelloBean {

    private String name;

    public HelloBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "name='" + name + '\'' +
                '}';
    }
}