package com.example.healthify.patient.entity;


import com.example.healthify.appointment.entity.Appointment;
import com.example.healthify.enums.BloodGroup;
import com.example.healthify.enums.GenoType;
import com.example.healthify.users.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patients")

public class Patient {
    private String firstName;
    private String LastName;
    private LocalDate dateOfBirth;
    private String phone;

    //Essential Medical Fields (simplified for a remote system)

    @Lob
    // stores allergies as comma-separated string
    private String knownAlleraies;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Enumerated(EnumType.STRING)
    private GenoType genotype;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;
}
