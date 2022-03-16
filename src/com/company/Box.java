package com.company;

public class Box <T>{
    private T name;

    public Box(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                '}';

    }

    public static Box box(){
        Box<String>stringBox = new Box<>("Kuba");
        return stringBox;
    }

//    public  static Box box(){
//        Box<Integer,Integer>integerBox=new Box<>(1,3);
//        return integerBox;
    }




