package com.example.dormitory.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Users")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "userPhone")
    private String userPhone;
    @Column(name = "roomNumber")
    private String roomNumber;


}
