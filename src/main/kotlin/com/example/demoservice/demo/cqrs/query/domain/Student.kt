package com.example.demoservice.demo.cqrs.query.domain

import javax.persistence.*


@Entity
@Table(name = "student")
data class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Int? =1,
    @Column(name = "fullName")
    var fullName:String? = "",
    @Column(name = "courseId")
    var courseId:Int? =1
)
