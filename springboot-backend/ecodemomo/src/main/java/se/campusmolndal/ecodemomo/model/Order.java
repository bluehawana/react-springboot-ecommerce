package se.campusmolndal.ecodemomo.model;

import javax.persistence.*;

@Entity
@Table(name = "orders") // This will map the entity to a table named "orders"
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming you want auto-generated IDs
    private Long id;

    // Other fields
    private String name;

    public Order(Product product) {
        this.product = product;
    }
    // ... all other fields ...

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    // ... getters and setters for other fields ...
}
