package com.kotlin.demo.converter

import com.kotlin.demo.dto.AddressDto
import com.kotlin.demo.model.Address
import org.springframework.stereotype.Component

@Component
class AddressDtoConverter {

    fun convertTo(address: Address): AddressDto? {
        return AddressDto(
                address.street,
                address.city,
                address.country
        )
    }
}