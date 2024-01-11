package com.employee.enquiry.system.model;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;

import java.util.Date;

@Table(name = "enquiry")
@Entity
public class enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String customerId;

    @Column(name = "customer_name")
    private String customerName;

    private String mobileNumber;
    private Integer age;
    private String gender;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date visitingDate;
    private String state;

    @Column(name = "customer_character")
    private String customerCharacter;


    private String rate;
    @Column(name = "document_submit")
    private String documentSubmit;

    public enquiry() {
        // Default constructor
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getVisitingDate() {
        return visitingDate;
    }

    public void setVisitingDate(Date visitingDate) {
        this.visitingDate = visitingDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCharacter() {
        return customerCharacter;
    }

    public void setCharacter(String customerCharacter) {
        this.customerCharacter = customerCharacter;
    }

    public String getDocumentSubmit() {
        return documentSubmit;
    }

    public void setDocumentSubmit(String documentSubmit) {
        this.documentSubmit = documentSubmit;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}

