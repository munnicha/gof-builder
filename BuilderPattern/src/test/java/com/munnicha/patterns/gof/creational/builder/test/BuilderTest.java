package com.munnicha.patterns.gof.creational.builder.test;

import com.munnicha.patterns.gof.creational.builder.book.Meal;
import com.munnicha.patterns.gof.creational.builder.book.MealBuilder;
import com.munnicha.patterns.gof.creational.builder.practical.Contact;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class BuilderTest {
    
    @Test
    public void builderPracticalTest(){
        Contact contact1 = new Contact.ContactBuilder("contact.builder@pattern.com")
                                .withFirstName("Contact")
                                .withLastName("Builder")
                                .atAddressLine1("180 Main Street")
                                .inCity("City")
                                .inCounty("County")
                                .inCountry("Country")
                                .hasPhone("+99180766611")
                                .withDescription("Additional contact info.").build();
        
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
        
        assertEquals("contact.builder@pattern.com",contact1.getEmail());
        assertEquals("+99180766611",contact1.getRawPhoneNumber());
        assertEquals("POBOX 9999",contact2.getAddressLine2());
        assertEquals("Province",contact2.getProvince());   
    }
    
    @Test
    public void builderBookTest(){
        MealBuilder mb=new MealBuilder();
        
        Meal classic=mb.prepareClassicBurgerMenu();
        Meal vega=mb.prepareVegaBurgerMenu();
        Meal family=mb.prepareFamilyBurgerMenu();

        assertEquals(1580.0,classic.calculateFullCost(),000.1);
        assertEquals(1320.0,vega.calculateFullCost(),000.1);
        assertEquals(6100.0,family.calculateFullCost(),000.1);
    }
}
