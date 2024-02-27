package patterns.builder.classes;

import patterns.builder.interfaces.CartBuilderInterface;

public class CartBuilder implements CartBuilderInterface {
    private Cart cart = new Cart();

    public CartBuilder empytCart(){
        this.cart = new Cart();
        return this;
    }

    @Override
    public CartBuilder addApple() {
        Apple apple = new Apple("Apple", 1);
        this.cart.add(apple);
        return this;
    }

    @Override
    public CartBuilderInterface addCup() {
        Cup cup = new Cup("Cup", 6);
        this.cart.add(cup);
        return this;
    }

    @Override
    public CartBuilderInterface addBroom() {
        Broom broom = new Broom("Broom", 18);
        this.cart.add(broom);
        return this;
    }

    @Override
    public CartBuilderInterface addDish() {
        Dish dish = new Dish("Dish", 10);
        this.cart.add(dish);
        return this;
    }

    public Cart getCart() { return cart; }

    public float getPrice(){  return this.cart.getPrice(); }
}
