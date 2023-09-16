package vn.edu.iuh.fit.truongbinhtriet_20044651_week2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ProductPrice")
public class ProductPrice {
    @OneToMany
    private List<Product> productList;
    private Date price_date_time;
    private double price;
    private String note;
}
