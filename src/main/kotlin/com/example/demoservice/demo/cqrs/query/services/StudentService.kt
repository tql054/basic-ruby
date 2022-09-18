package com.example.demoservice.demo.cqrs.query.services

import com.example.demoservice.demo.cqrs.query.domain.Student
import com.example.demoservice.demo.cqrs.query.repositories.StudentRepository
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@Component
class StudentService(val studentRepository: StudentRepository) {
    fun findAll() = studentRepository.findAll()
    fun findById(@PathVariable id:Int): Optional<Student> {
        return studentRepository.findById(id)
    }
}