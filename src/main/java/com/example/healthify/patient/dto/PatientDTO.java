package com.example.healthify.patient.dto;


import com.example.healthify.enums.BloodGroup;
import com.example.healthify.enums.GenoType;
import com.example.healthify.users.dto.UserDTO;
import com.example.healthify.users.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientDTO {

    private Long id;

    private String firstName;
    private String LastName;
    private LocalDate dateOfBirth;
    private String phone;

    private String knownAlleraies;
    private BloodGroup bloodGroup;
    private GenoType genotype;
    private UserDTO user;

}
