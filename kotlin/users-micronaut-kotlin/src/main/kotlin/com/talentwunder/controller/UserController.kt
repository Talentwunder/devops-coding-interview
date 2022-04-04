package com.talentwunder.controller

import com.talentwunder.dto.UserDTO
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/users")
class UserController {

    @Get("/")
    fun get(): List<UserDTO> {
        return listOf(UserDTO("ff560988-a020-4afa-b455-37d19d649aae", "test@talentwunder.com"))
    }
}
