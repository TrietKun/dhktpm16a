package vn.edu.iuh.fit.truongbinhtriet_20044651_week2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail {
    @Id
    @OneToMany
    private List<Order> OrderList;
    @OneToMany
    private List<Product> productList;
    private int quantityl;
    private double price;
    private String note;
}
