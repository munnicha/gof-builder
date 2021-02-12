package com.munnicha.patterns.gof.creational.builder.book;

/**
 *
 * @author munnicha
 */
public class MealBuilder {
    
    public Meal prepareClassicBurgerMenu(){
        Meal meal=new Meal();
        meal.addItem(new ClassicBurger());
        meal.addItem(new CocaCola());
        return meal;
    }
    
    public Meal prepareVegaBurgerMenu(){
        Meal meal=new Meal();
        meal.addItem(new VegaBurger());
        meal.addItem(new ZeroCola());
        return meal;
    }
    
    public Meal prepareFamilyBurgerMenu(){
        Meal meal=new Meal();
        meal.addItem(new ClassicBurger());
        meal.addItem(new ClassicBurger());
        meal.addItem(new ClassicBurger());
        meal.addItem(new VegaBurger());
        meal.addItem(new CocaCola());
        meal.addItem(new ZeroCola());
        meal.addItem(new Pepsi());
        meal.addItem(new Pepsi());
        return meal;
    }
}
