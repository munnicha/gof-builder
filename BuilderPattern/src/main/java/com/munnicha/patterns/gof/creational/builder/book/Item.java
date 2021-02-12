package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public interface Item {
    public String name();
    public Packing packing();
    public double price();
}
