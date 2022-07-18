package com.kotlin.demo.controller

import com.kotlin.demo.dto.AddressDto
import com.kotlin.demo.dto.CreateAddressRequest
import com.kotlin.demo.service.AddressService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class AddressController(private val addressService: AddressService) {

    @PostMapping("/{userId}/address")
    fun assignAddressToUser(@PathVariable userId: Int,
                            @RequestBody request: CreateAddressRequest): ResponseEntity<AddressDto> {
        return ResponseEntity.status(HttpStatus.CREATED).body(addressService.createAddress(userId, request))
    }
}