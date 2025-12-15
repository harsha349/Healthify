package com.example.healthify.doctor.entity;


import com.example.healthify.appointment.entity.Appointment;
import com.example.healthify.enums.Specialization;
import com.example.healthify.users.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctors")
public class Doctor {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   private String firstName;
   private String lastName;

   @Enumerated(EnumType.STRING)
    private Specialization specialization;

   private String LicenseNumber;

   @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" , unique = true , nullable = false)
    private User user;

   @OneToMany(mappedBy = "doctor" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;

}
