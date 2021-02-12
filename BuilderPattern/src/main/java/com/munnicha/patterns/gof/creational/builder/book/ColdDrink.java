package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
    
    @Override
    public String toString() {
        return "Drink{name: "+this.name()+", packing: "+this.packing().pack()+", price: "+this.price()+"}";
    }
    
}
