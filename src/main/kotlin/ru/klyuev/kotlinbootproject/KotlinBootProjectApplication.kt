package ru.klyuev.kotlinbootproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootProjectApplication

fun main(args: Array<String>) {
    runApplication<KotlinBootProjectApplication>(*args)
}
