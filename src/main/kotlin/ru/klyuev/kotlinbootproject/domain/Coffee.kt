package ru.klyuev.kotlinbootproject.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Coffee(
    @Id
    val id: Long,
    val name: String
)
