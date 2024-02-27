package tests;

import patterns.singleton.MySingleton;

public class MySingletonTest {
    public static void start(){
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();

        s1.setAtributeTest("This is a test!");

        System.out.println(s2.getAtributeTest());
    }
}
