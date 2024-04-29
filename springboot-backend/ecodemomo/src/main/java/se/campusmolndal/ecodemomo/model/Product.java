package se.campusmolndal.ecodemomo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty
    private String name;

    @Column(length = 5000)
    @JsonProperty
    private String description;

    @JsonProperty
    private double price;

    @JsonProperty
    private int quantity;

    @JsonProperty
    private String slug;

    @JsonProperty
    private String image;

    public Product() {
    }

    public Product(Long id, String name, String description, double price, int quantity, String slug, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.slug = slug;
        this.image = image;
    }

    // Getters and Setters

    // ... existing getters and setters ...

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getId() {
        return id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setDescription(String description) {
           this.description=description;
    }

    public void setPrice(Double price) {
        this.price=price;
    }
    // ... other getters and setters ...
}