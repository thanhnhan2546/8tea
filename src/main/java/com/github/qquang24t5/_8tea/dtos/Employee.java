package com.github.qquang24t5._8tea.dtos;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(unique = true, nullable = false)
    private String password;

    @NotNull
    @Column(nullable = false)
    private Boolean passwordHashed;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private Boolean male;

    public Employee() {
        id = null;
        phoneNumber = null;
        password = null;
        passwordHashed = null;
        firstName = null;
        lastName = null;
        male = null;
    }

    public Employee(Integer id, String phoneNumber, String password, Boolean passwordHashed, String firstName,
                    String lastName, LocalDate dateOfBirth, Boolean male) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.passwordHashed = passwordHashed;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.male = male;
    }

    public Integer getId() {
        return id;
    }

    public Employee setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Employee setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    public Boolean getPasswordHashed() {
        return passwordHashed;
    }

    public Employee setPasswordHashed(Boolean passwordHashed) {
        this.passwordHashed = passwordHashed;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Employee setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Boolean getMale() {
        return male;
    }

    public Employee setMale(Boolean male) {
        this.male = male;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", passwordHashed=" + passwordHashed +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", male=" + male +
                '}';
    }
}
