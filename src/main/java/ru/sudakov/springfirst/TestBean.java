package ru.sudakov.springfirst;

public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
