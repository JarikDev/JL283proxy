package com;

public class Main {
    public static void main(String[] args) {
        CarI car=new CarProxy();
        car.drive();
    }
}
interface CarI {
    void drive();
}

class CarProxy implements CarI{
    CarI carI=new Reno();

    @Override
    public void drive() {
        System.out.println("This is proxy code");
        carI.drive();
    }
}

class Reno implements CarI {

    @Override
    public void drive() {
        System.out.println("Drive Reno");
    }
}