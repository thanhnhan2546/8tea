package com.github.qquang24t5._8tea.transference;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true, nullable = false)
    private String mobile;

    @Transient
    private String password;

    @NotNull
    @Column(unique = true, nullable = false)
    private String passwordHash;

    private String name;

    private LocalDate dateOfBirth;

    enum Gender { MALE, FEMALE }
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Employee_Permission",
            joinColumns = { @JoinColumn(name = "EmployeeId") },
            inverseJoinColumns = { @JoinColumn(name = "PermissionId") }
    )
    private List<Permission> permissions;

}
