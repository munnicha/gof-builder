package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public class ClassicBurger extends Burger{

    @Override
    public double price() {
        return 1290.0;
    }

    @Override
    public String name() {
        return "Classic Burger";
    }
    
}
