package com.talentwunder.controller

import com.talentwunder.dto.OrganizationDTO
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/organizations")
class OrganizationController {

    @Get("/")
    fun get(): List<OrganizationDTO> {
        return listOf(OrganizationDTO("eb3791d3-825b-4fd2-a5ac-ad8e17c529a4", "test-organization"))
    }
}
