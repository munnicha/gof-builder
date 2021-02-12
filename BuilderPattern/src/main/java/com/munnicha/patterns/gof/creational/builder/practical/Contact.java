package com.munnicha.patterns.gof.creational.builder.practical;

/**
 *
 * @author munnicha
 */
public class Contact {
    
    private String firstName;
    private String lastName;
    private String email;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String county;
    private String province;
    private String city;
    private String country;
    private String rawPhoneNumber;
    private String description;
    
    private Contact(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRawPhoneNumber() {
        return rawPhoneNumber;
    }

    public void setRawPhoneNumber(String rawPhoneNumber) {
        this.rawPhoneNumber = rawPhoneNumber;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", addressLine4=" + addressLine4 + ", county=" + county + ", province=" + province + ", city=" + city + ", country=" + country + ", rawPhoneNumber=" + rawPhoneNumber + ", description=" + description + '}';
    }

    public static class ContactBuilder{
        private String firstName;
        private String lastName;
        private String email; //mandatory
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String addressLine4;
        private String county;
        private String province;
        private String city;
        private String country;
        private String rawPhoneNumber;
        private String description;
        
        public ContactBuilder(String email){
            this.email=email;
        }
        
        public ContactBuilder withFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }
        public ContactBuilder withLastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        public ContactBuilder atAddressLine1(String addressLine1){
            this.addressLine1=addressLine1;
            return this;
        }
        public ContactBuilder atAddressLine2(String addressLine2){
            this.addressLine2=addressLine2;
            return this;
        }
        public ContactBuilder atAddressLine3(String addressLine3){
            this.addressLine3=addressLine3;
            return this;
        }
        public ContactBuilder atAddressLine4(String addressLine4){
            this.addressLine4=addressLine4;
            return this;
        }
        public ContactBuilder inCity(String city){
            this.city=city;
            return this;
        }
        public ContactBuilder inCounty(String county){
            this.county=county;
            return this;
        }
        public ContactBuilder inProvince(String province){
            this.province=province;
            return this;
        }
        public ContactBuilder inCountry(String country){
            this.country=country;
            return this;
        }
        public ContactBuilder hasPhone(String rawPhoneNumber){
            this.rawPhoneNumber=rawPhoneNumber;
            return this;
        }
        public ContactBuilder withDescription(String description){
            this.description=description;
            return this;
        }
        public Contact build(){
            Contact contact=new Contact();
            contact.firstName=this.firstName;
            contact.lastName=this.lastName;
            contact.email=this.email;
            contact.addressLine1=this.addressLine1;
            contact.addressLine2=this.addressLine2;
            contact.addressLine3=this.addressLine3;
            contact.addressLine4=this.addressLine4;
            contact.city=this.city;
            contact.county=this.county;
            contact.province=this.province;
            contact.country=this.country;
            contact.rawPhoneNumber=this.rawPhoneNumber;
            contact.description=this.description;
            return contact;
        }
    }
}
