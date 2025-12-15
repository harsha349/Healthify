package com.example.healthify.appointment.dto;


import com.example.healthify.doctor.DTO.DoctorDTO;
import com.example.healthify.enums.AppointmentStatus;
import com.example.healthify.patient.dto.PatientDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentDTO {

    private Long id;
    @NotNull(message = "Doctor ID is required for booking")
    private Long doctorId;

    private String purposeofConsultation;

    private String initialSymptoms;

    @NotNull(message = "start time is required for the apppointment.")
    @Future(message = "Appointment must be scheduled for a future date and time.")
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private String meetingLink;

    private AppointmentStatus status;

    private DoctorDTO doctor;
    private PatientDTO patient;

}
