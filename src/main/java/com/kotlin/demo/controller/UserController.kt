package com.kotlin.demo.controller

import com.kotlin.demo.dto.CreateUserRequest
import com.kotlin.demo.dto.UserDto
import com.kotlin.demo.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody request: CreateUserRequest): ResponseEntity<UserDto> {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(request))
    }

    @GetMapping("/{userId}")
    fun createUser(@PathVariable userId: Int): ResponseEntity<UserDto> {
        return ResponseEntity.ok(userService.getUserById(userId))
    }
}