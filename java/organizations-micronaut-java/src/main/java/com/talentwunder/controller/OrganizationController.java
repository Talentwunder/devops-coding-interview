package com.talentwunder.controller;

import com.talentwunder.dto.OrganizationDTO;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/organizations")
public class OrganizationController {

    @Get("/")
    List<OrganizationDTO> get() {
        return List.of(new OrganizationDTO("75d19288-6c17-4c62-9337-8d67de0ac6af", "test-organization"));
    }
}
