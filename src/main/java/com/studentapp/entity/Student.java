package com.studentapp.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Data -> dont use this with @entity
@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private String address;
    private double salary;
}
