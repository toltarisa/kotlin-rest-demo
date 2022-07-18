package com.kotlin.demo.model

import javax.persistence.*

@Entity
@Table(name = "users")
data class User (
        @Column(name = "first_name")
        val firstName: String?,

        @Column(name = "last_name")
        val lastName: String?,

        val email: String?,
        val age: Int?,

        @OneToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "address_id", referencedColumnName = "id")
        var address: Address?,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null
) {
}