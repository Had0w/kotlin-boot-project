package ru.klyuev.kotlinbootproject.repo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.klyuev.kotlinbootproject.domain.Coffee

@Repository
interface CoffeeRepo : CrudRepository<Coffee, Long>