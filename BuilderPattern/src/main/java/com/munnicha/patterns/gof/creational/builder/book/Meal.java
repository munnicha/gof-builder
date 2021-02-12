package com.munnicha.patterns.gof.creational.builder.book;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author munnicha
 */
public class Meal {
    
    List<Item> items = new ArrayList<>();
    
    public void addItem(Item it){
        items.add(it);
    }
    
    public double calculateFullCost(){
        double fullCost=0.0;
        for(Item it:items){
            fullCost+=it.price();
        }
        return fullCost;
    }
    
    public void showItems(){
        items.forEach(it -> {
            System.out.println(it.toString());
        });
    }
}
