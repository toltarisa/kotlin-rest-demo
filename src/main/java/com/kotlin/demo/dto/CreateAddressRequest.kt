package com.kotlin.demo.dto

data class CreateAddressRequest(
        val street: String?,
        val city: String?,
        val country: String?
)