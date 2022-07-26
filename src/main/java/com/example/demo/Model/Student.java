package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "MaSV")
    private String MaSV;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Address")
    private String Address;
    @Column(name = "Phone")
    private String Phone;
    @Column(name = "Email")
    private String Email;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

