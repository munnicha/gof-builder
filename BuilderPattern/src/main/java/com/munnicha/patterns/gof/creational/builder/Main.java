package com.munnicha.patterns.gof.creational.builder;

import com.munnicha.patterns.gof.creational.builder.book.Meal;
import com.munnicha.patterns.gof.creational.builder.book.MealBuilder;
import com.munnicha.patterns.gof.creational.builder.practical.Contact;

/**
 *
 * @author munnicha
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Builder pattern practical");
        Contact contact1 = new Contact.ContactBuilder("contact.builder@pattern.com")
                                .withFirstName("Contact")
                                .withLastName("Builder")
                                .atAddressLine1("180 Main Street")
                                .inCity("City")
                                .inCounty("County")
                                .inCountry("Country")
                                .hasPhone("+99180766611")
                                .withDescription("Additional contact info.").build();
        System.out.println(contact1);
        
        Contact contact2 = new Contact.ContactBuilder("contact2.builder@pattern.com")
                                .withFirstName("Contact2")
                                .withLastName("Builder")
                                .atAddressLine1("180 Main Street")
                                .atAddressLine2("POBOX 9999")
                                .inCity("City")
                                .inProvince("Province")
                                .inCountry("Country")
                                .hasPhone("+9937180129")
                                .withDescription("Additional contact info.").build();
        System.out.println(contact2);
        
        System.out.println("\r\nBuilder pattern book");
        
        MealBuilder mb=new MealBuilder();
        
        Meal classic=mb.prepareClassicBurgerMenu();
        System.out.println("Classic menu");
        classic.showItems();
        System.out.println("Total cost: "+classic.calculateFullCost()+"\r\n");
        
        Meal vega=mb.prepareVegaBurgerMenu();
        System.out.println("Vega menu");
        vega.showItems();
        System.out.println("Total cost: "+vega.calculateFullCost()+"\r\n");
        
        Meal family=mb.prepareFamilyBurgerMenu();
        System.out.println("Family menu");
        family.showItems();
        System.out.println("Total cost: "+family.calculateFullCost()+"\r\n");
    }
}
