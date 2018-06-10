package com.ia.demo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Diagnostic {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private String variable1;
    private String variable2;
    private String variable3;
    private String variable4;

    @ManyToOne
    @JoinColumn(name="personId")
    private Person person;

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }

    public String getVariable1() {
        return variable1;
    }

    public String getVariable2() {
        return variable2;
    }

    public String getVariable3() {
        return variable3;
    }

    public String getVariable4() {
        return variable4;
    }
}
