package com.kotlin.demo.dto

data class CreateUserRequest(
        val firstName: String?,
        val lastName: String?,
        val email: String?,
        val age: Int?
)