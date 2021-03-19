package com.github.qquang24t5._8tea.transference;

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
    private String mobile;

    @NotNull
    @Column(unique = true, nullable = false)
    private String password;

    private String name;

    private LocalDate dateOfBirth;

    enum Gender { MALE, FEMALE }
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Employee() {
        id = null;
        mobile = null;
        password = null;
        name = null;
        dateOfBirth = null;
        gender = null;
    }

    public Integer getId() {
        return id;
    }

    public Employee setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public Employee setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Employee setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Employee setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }
}
