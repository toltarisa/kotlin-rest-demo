package com.kotlin.demo.repository

import com.kotlin.demo.model.Address
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository: JpaRepository<Address, Int> {
}