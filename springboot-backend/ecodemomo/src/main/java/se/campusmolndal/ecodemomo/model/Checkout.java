package se.campusmolndal.ecodemomo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String address;
    private String city;
    private String zip;
    private String country;
    private String phone;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardExpiration;
    private String cardCvv;

    public Checkout() {
    }

    public Checkout(Long id, String name, String email, String address, String city, String zip, String country, String phone, String paymentMethod, String cardName, String cardNumber, String cardExpiration, String cardCvv) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
        this.paymentMethod = paymentMethod;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardExpiration = cardExpiration;
        this.cardCvv = cardCvv;
    }

    // Getters and Setters

    // ... existing getters and setters ...

    public String getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public String getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip()
    {
        return zip;
    }
}
