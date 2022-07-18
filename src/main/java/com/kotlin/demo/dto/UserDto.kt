package com.kotlin.demo.dto

data class UserDto(
        val id: Int?,
        val firstName: String?,
        val lastName: String?,
        val email: String?,
        val age: Int?,
        val address: AddressDto?
)