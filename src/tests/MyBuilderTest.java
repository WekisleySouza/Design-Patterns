package tests;

import patterns.builder.classes.CartBuilder;

public class MyBuilderTest {
    public static void start(){
        CartBuilder cartBuilder = new CartBuilder();
        cartBuilder.addApple().addBroom().addCup().addApple();
        System.out.println(cartBuilder.getPrice());
    }
}
