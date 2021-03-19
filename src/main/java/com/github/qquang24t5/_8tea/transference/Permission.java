package com.github.qquang24t5._8tea.transference;

import javax.persistence.*;

public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    enum Name { EMPLOYEE }
    @Enumerated(EnumType.STRING)
    private Name name;

    private String description;

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

    public Name getName() {
        return name;
    }

    public Permission setName(Name name) {
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

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name=" + name +
                ", description='" + description + '\'' +
                '}';
    }
}
