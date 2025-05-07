package com.planit.backend.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "users")
data class User(
    @Id
    val id: String? = null,
    val name: String,
    val lastName: String,
    val username: String,
    val password: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
)