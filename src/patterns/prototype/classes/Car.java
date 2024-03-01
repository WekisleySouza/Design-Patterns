package patterns.prototype.classes;

import patterns.prototype.interfaces.Prototype;

public class Car implements Prototype{
    private String model;
    private float price;

    public Car(String model, float price){
        this.model = model;
        this.price = price;
    }

    public Car clone(){
        return new Car(this.model, this.price);
    }
}
