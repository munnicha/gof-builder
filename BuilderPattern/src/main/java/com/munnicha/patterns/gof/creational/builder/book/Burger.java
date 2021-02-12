package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double price();

    @Override
    public String toString() {
        return "Burger{name: "+this.name()+", packing: "+this.packing().pack()+", price: "+this.price()+"}";
    }
}
