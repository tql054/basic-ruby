package com.example.demoservice.demo

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@OpenAPIDefinition
@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
