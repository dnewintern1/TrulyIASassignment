package com.base.trulyiasassignment;

public class item {

    private String name ;
    private int number;

    private  String losss;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLosss() {
        return losss;
    }

    public void setLosss(String losss) {
        this.losss = losss;
    }

    public item(String name, int number, String losss) {
        this.name = name;
        this.number = number;
        this.losss = losss;
    }
}
