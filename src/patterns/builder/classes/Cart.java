package patterns.builder.classes;

import java.util.ArrayList;
import java.util.List;

import patterns.builder.interfaces.CartInterface;

public class Cart implements CartInterface {
    private List<Product> products;

    public Cart(){
        this.products = new ArrayList<>();
    }

    @Override
    public float getPrice() {
        float sumPrices = 0;
        for (Product product : this.products) {
            sumPrices += product.getPrice();
        }
        return sumPrices;
    }

    public List<Product> getProducts() {
        return products;
    }
    
    public void add(Product product){
        this.products.add(product);
    }

    public void add(Product[] products){
        for (Product product : products) {
            this.products.add(product);
        }
    }
}
