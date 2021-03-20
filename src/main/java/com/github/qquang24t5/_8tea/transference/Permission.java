package com.github.qquang24t5._8tea.transference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @ManyToMany(mappedBy = "permissions", fetch = FetchType.LAZY)
    private List<Employee> employees;

    public Permission() {
        id = null;
        name = null;
        description = null;
    }

    public Integer getId() {
        return id;
    }

    public Permission setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Permission setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Permission setEmployees(List<Employee> employees) {
        this.employees = employees;
        return this;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name=" + name +
                ", description='" + description + '\'' +
                '}';
    }
}
