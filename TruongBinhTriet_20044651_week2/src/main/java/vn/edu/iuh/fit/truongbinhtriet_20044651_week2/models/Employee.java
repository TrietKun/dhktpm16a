package vn.edu.iuh.fit.truongbinhtriet_20044651_week2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {
   @Id
    private long id;
    private  String address;
    private Date dob;
    private String email;
    private String fullname;
    private String phone;
    private String status;
    @OneToMany
    private List<Order> orderList;
}
