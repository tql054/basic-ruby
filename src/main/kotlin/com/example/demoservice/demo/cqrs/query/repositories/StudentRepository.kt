package com.example.demoservice.demo.cqrs.query.repositories

import com.example.demoservice.demo.cqrs.query.domain.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Int> {
}