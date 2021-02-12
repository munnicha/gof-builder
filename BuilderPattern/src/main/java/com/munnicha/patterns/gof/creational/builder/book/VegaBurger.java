package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public class VegaBurger extends Burger{

    @Override
    public double price() {
        return 990.0;
    }

    @Override
    public String name() {
        return "Vega Burger";
    }
    
}
