package ru.klyuev.kotlinbootproject.service

import org.springframework.stereotype.Component
import ru.klyuev.kotlinbootproject.domain.Coffee
import ru.klyuev.kotlinbootproject.repo.CoffeeRepo
import javax.annotation.PostConstruct

@Component
class DbFiller(var coffeeRepo : CoffeeRepo) {

    @PostConstruct
    fun init() {
        val coffeeList = listOf(Coffee(1, "americano"), Coffee(2, "mokka"))
        coffeeRepo.saveAll(coffeeList);
    }
}