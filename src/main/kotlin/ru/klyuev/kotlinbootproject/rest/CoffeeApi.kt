package ru.klyuev.kotlinbootproject.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.klyuev.kotlinbootproject.domain.Coffee
import ru.klyuev.kotlinbootproject.repo.CoffeeRepo
import java.util.*

@RestController
@RequestMapping("/coffee")
class CoffeeApi(val coffeeRepo: CoffeeRepo) {

    @GetMapping
    fun getCoffee(): List<Coffee> {
        return coffeeRepo.findAll() as List<Coffee>;
    }

    @GetMapping("/{id}")
    fun getCoffeeById(@PathVariable("id") id: Long): Optional<Coffee?> {

        return coffeeRepo.findById(id)
    }

    @PostMapping
    fun addCoffee(@RequestBody coffee: Coffee): Coffee {
        return coffeeRepo.save(coffee)
    }


    @PutMapping("/{id}")
    fun updateCoffee(@PathVariable("id") id: Long, @RequestBody coffee: Coffee): ResponseEntity<Coffee> {

        return if (coffeeRepo.existsById(id)) {
            ResponseEntity(coffeeRepo.save(coffee), HttpStatus.OK)
        } else {
            ResponseEntity(coffeeRepo.save(coffee), HttpStatus.CREATED)
        }
    }

    @DeleteMapping("/{id}")
    fun deleteCoffee(@PathVariable("id") id: Long) {
        coffeeRepo.deleteById(id)
    }
}