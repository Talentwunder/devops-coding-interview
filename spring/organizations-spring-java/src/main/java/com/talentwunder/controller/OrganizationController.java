package com.talentwunder.controller;

import com.talentwunder.dto.OrganizationDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<OrganizationDTO> get() {
        return List.of(new OrganizationDTO("75d19288-6c17-4c62-9337-8d67de0ac6af", "test-organization"));
    }
}
