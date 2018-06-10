package com.ia.demo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String dni;
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinColumn(name="personId")
    private List<Diagnostic> diagnosticList;

    public Long getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Diagnostic> getDiagnosticList() {
        return diagnosticList;
    }
}
