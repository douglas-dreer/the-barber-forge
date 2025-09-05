package br.com.barberforge.barbersforge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TheBarberForgeApplication

fun main(args: Array<String>) {
    runApplication<TheBarberForgeApplication>(*args)
}
