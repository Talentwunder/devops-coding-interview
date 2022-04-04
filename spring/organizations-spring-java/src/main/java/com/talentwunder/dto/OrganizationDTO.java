package com.talentwunder.dto;

public class OrganizationDTO {
    private String id;
    private String organizationName;

    public OrganizationDTO(String id, String organizationName) {
        this.id = id;
        this.organizationName = organizationName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
