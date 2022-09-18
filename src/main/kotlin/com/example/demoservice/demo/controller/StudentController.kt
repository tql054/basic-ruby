package com.example.demoservice.demo.controller

import com.example.demoservice.demo.cqrs.query.domain.ResponseObject
import com.example.demoservice.demo.cqrs.query.domain.Student
import com.example.demoservice.demo.cqrs.query.services.StudentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/student")
class StudentController(val studentService: StudentService) {
    @GetMapping("")
    fun getAllStudent():List<Student> = studentService.findAll()

    @GetMapping("/id={id}")
    fun getStudentById(@PathVariable id:Int): ResponseEntity<ResponseObject> {
        val student: Optional<Student> = studentService.findById(id)
        return ResponseEntity.status(HttpStatus.OK).body(
            ResponseObject("ok", "get student successful", student)
        )
//        return studentService.findById(id)
    }
}