package com.local.spring_docker_db_app;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "employees")
public class Employees {

    @Id
    @Column(name = "Emp_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    @Column(name = "Emp_Name")
    private String empName;
    @Column(name = "Emp_Add")
    private String empAdd;
}
