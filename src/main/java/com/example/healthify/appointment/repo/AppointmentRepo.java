package com.example.healthify.appointment.repo;

import com.example.healthify.appointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.*;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

    List<Appointment> findByDoctor_User_idOrderByIdDesc(Long userId);
    List<Appointment> findByPatient_User_idOrderByIdDesc(Long userId);

    @Query("SELECT a FROM Appointment a" +

            "WHERE a.doctor.id = :doctorId "+

            "AND a.status = 'SCHEDULED' " +
            "AND (" +
                            // Only check for scheduled/confirmed appointments

// Case 1: Existing appointment starts during the new slot

    "(a.startTime < :newEndTime AND a.endTime > :newStartTime)" + ")")

    List<Appointment> findConflictingAppointments(

            @Param("doctorId") Long doctorId,

            @Param("newStartTime") LocalDateTime newStartTime,

            @Param("newEndTime") LocalDateTime newEndTime

    );


}
