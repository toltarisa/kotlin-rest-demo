package com.kotlin.demo.service

import com.kotlin.demo.converter.AddressDtoConverter
import com.kotlin.demo.dto.AddressDto
import com.kotlin.demo.dto.CreateAddressRequest
import com.kotlin.demo.model.Address
import com.kotlin.demo.model.User
import com.kotlin.demo.repository.AddressRepository
import org.springframework.stereotype.Service

@Service
class AddressService(private val addressRepository: AddressRepository,
                     private val userService: UserService,
                     private val addressDtoConverter: AddressDtoConverter) {

    fun createAddress(userId: Int, request: CreateAddressRequest): AddressDto? {
        val user: User = userService.getUser(userId)
        val address = Address(
                request.street,
                request.city,
                request.country,
                null
        )

        user.address = address
        userService.saveUser(user)
        return addressDtoConverter.convertTo(address)
    }
}