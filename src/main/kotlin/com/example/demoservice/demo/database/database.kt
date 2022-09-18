package com.example.demoservice.demo.database

import com.example.demoservice.demo.cqrs.query.domain.Student
import com.example.demoservice.demo.cqrs.query.repositories.StudentRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Database {
    private final val logger: Logger = LoggerFactory.getLogger(Database::class.java)
    @Bean
    fun initDatabase(studentRepository: StudentRepository?): CommandLineRunner {
        var student = Student(null,"d", 3)
        return CommandLineRunner {
            val student1:Student = Student(null, "Le Quoc Tuan", 1)
            val student2:Student = Student(null, "Tuan Quoc Le", 1)
            logger.info("insert data...:")
            logger.info("inserted data: ${studentRepository!!.save(student1)}")
            logger.info("inserted data: ${studentRepository!!.save(student2)}")
        }
    }
}