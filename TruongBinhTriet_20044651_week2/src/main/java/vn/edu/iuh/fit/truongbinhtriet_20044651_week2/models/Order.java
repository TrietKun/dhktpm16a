package vn.edu.iuh.fit.truongbinhtriet_20044651_week2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "Oder")
public class Order {
    @Id
    private long orderId;
    private Date orderDate;


}
