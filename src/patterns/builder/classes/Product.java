package patterns.builder.classes;

import patterns.builder.interfaces.ProductInterface;

public abstract class Product implements ProductInterface{
    private String name;
    private float price;

    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    
    public float getPrice() {
        return this.price;
    }
}
