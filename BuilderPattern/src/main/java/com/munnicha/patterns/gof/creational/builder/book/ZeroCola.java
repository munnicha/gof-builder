package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public class ZeroCola extends ColdDrink{

    @Override
    public double price() {
        return 330.0;
    }

    @Override
    public String name() {
        return "Zero Cola";
    }
    
}
