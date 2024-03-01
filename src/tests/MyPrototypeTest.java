package tests;

import patterns.prototype.classes.Car;

public class MyPrototypeTest {

    public static void start(){
        Car car1 = new Car("Cruze", 100000);
        Car car2 = car1.clone();
        car2.setModel("Tracker");
        
        System.out.println(car1.getModel());
        System.out.println(car2.getModel());
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
    }
}
