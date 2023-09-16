package vn.edu.iuh.fit.truongbinhtriet_20044651_week2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    private long productId;
    private String productName;
    private String description;
    private String unit;
    private String manufacturer;
}
