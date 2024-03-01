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

    public String getModel() { return model; }

    public float getPrice() { return price; }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
