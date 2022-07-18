package com.kotlin.demo.converter

import com.kotlin.demo.dto.CreateUserRequest
import com.kotlin.demo.dto.UserDto
import com.kotlin.demo.model.User
import org.springframework.stereotype.Component

@Component
class UserDtoConverter(private val addressDtoConverter: AddressDtoConverter) {

    fun convertTo(dto: CreateUserRequest): User {
        return User(
                dto.firstName,
                dto.lastName,
                dto.email,
                dto.age,
                null,
                null
        )
    }

    fun convertTo(user: User): UserDto {
        return UserDto(
                user.id,
                user.firstName,
                user.lastName,
                user.email,
                user.age,
                user.address?.let { addressDtoConverter.convertTo(it) }
        )
    }
}