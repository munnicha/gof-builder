package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public class CocaCola extends ColdDrink{

    @Override
    public double price() {
        return 290.0;
    }

    @Override
    public String name() {
        return "Coca Cola";
    }
    
}
