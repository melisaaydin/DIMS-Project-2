package com.sau.dims.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surname;
    @Column(length = 15)
    private String phone;
    @Column(length = 100)
    private String address;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Appointment> doctorPatients;

    public Patient() {

    }

    public Patient(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDoctorPatients(List<Appointment> doctorPatients) {
        this.doctorPatients = doctorPatients;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public List<Appointment> getDoctorPatients() {
        return doctorPatients;
    }
}
