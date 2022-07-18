package com.kotlin.demo.service

import com.kotlin.demo.converter.UserDtoConverter
import com.kotlin.demo.dto.CreateUserRequest
import com.kotlin.demo.dto.UserDto
import com.kotlin.demo.exception.UserNotFoundException
import com.kotlin.demo.model.User
import com.kotlin.demo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository,
                  private val userDtoConverter: UserDtoConverter) {

    fun createUser(request: CreateUserRequest): UserDto? {
        val user: User = saveUser(userDtoConverter.convertTo(request))
        return userDtoConverter.convertTo(user)
    }

    fun saveUser(user: User): User {
        return userRepository.save(user)
    }

    fun getUserById(userId: Int): UserDto {
        return userDtoConverter.convertTo(getUser(userId))
    }

    fun getUser(userId: Int): User {
        return userRepository.findById(userId)
                .orElseThrow { throw UserNotFoundException("User with id = " + userId + "does not exists") }
    }
}