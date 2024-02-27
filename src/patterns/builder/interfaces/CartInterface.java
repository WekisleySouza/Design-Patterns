package patterns.builder.interfaces;

import java.util.List;

import patterns.builder.classes.Product;

public interface CartInterface {
    
    public float getPrice();
    public List<Product> getProducts();
}
