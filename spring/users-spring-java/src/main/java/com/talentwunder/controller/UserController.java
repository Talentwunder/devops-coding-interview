package com.talentwunder.controller;

import com.talentwunder.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDTO> get() {
        return List.of(new UserDTO("1c2b0065-2068-458e-8f7e-8d778d8756bc", "test@talentwunder.com"));
    }
}
