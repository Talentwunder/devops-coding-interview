package com.talentwunder.controller;

import com.talentwunder.dto.UserDTO;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/users")
public class UserController {

    @Get("/")
    List<UserDTO> get() {
        return List.of(new UserDTO("f08ec591-ac64-4425-b8b2-f92b1a1e28fb", "test@talentwunder.com"));
    }
}
