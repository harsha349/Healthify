package com.example.healthify.users.dto;
import com.example.healthify.role.entity.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)


public class UserDTO {

    private Long id;
    private String name;


    private String email;

    @JsonInclude
    private String password;

    private String profilePictureUrl;


    private List<Role> roles;
}
