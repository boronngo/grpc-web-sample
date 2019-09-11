package com.example.grpcwebsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcWebSampleApplication

fun main(args: Array<String>) {
	runApplication<GrpcWebSampleApplication>(*args)
}
