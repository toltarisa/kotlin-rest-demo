package com.kotlin.demo.model

import javax.persistence.*

@Entity
@Table(name = "address")
data class Address(
        val street: String?,
        val city: String?,
        val country: String?,

        @OneToOne(mappedBy = "address")
        val user: User?,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null
)