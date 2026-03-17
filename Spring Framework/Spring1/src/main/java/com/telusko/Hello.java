package com.telusko;

public class Hello {
    private String message;

    public Hello(){
        System.out.println("Hello Object Created");
    }

    public Hello(String message){
        System.out.println("Constructor Injection");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setter Called");
        this.message = message;
    }

    public void  sayHello()
    {
        System.out.println("Hello World");
    }
}
