package com.litsynp.redissession.domain

import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {

    fun findByEmail(email: String): Member?
}
