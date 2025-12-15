package com.example.healthify.users.dto;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder


public class Loginresponse
{
   private String token;
   private List<String> roles;

}
