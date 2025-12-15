package com.example.healthify.users.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data@JsonIgnoreProperties(ignoreUnknown = true)
public class Resetpasswordrequest {
    private String email;
    private String code;
    private String newPassword;
}
