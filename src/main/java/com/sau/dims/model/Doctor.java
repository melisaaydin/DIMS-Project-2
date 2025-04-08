package com.sau.dims.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)

    private String name;

    @Column(length = 50)
    private String surname;

    @Column(length = 50)
    private String clinique;


    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Appointment> doctorPatients;

    public Doctor(Long id, List<Appointment> doctorPatients, String clinique, String surname, String name) {
        this.id = id;
        this.doctorPatients = doctorPatients;
        this.clinique = clinique;
        this.surname = surname;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDoctorPatients(List<Appointment> doctorPatients) {
        this.doctorPatients = doctorPatients;
    }

    public void setClinique(String clinique) {
        this.clinique = clinique;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public List<Appointment> getDoctorPatients() {
        return doctorPatients;
    }

    public String getClinique() {
        return clinique;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Doctor() {
    }
}
