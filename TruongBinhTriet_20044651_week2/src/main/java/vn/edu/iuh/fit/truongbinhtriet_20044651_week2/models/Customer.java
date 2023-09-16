package vn.edu.iuh.fit.truongbinhtriet_20044651_week2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    private long customerId;
    private String customerName;
    private String email;
    private String phone;
    private String address;
    @OneToMany
    private List<Order> orderList;
}
