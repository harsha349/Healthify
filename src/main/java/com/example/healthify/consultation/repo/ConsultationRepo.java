package com.example.healthify.consultation.repo;
import com.example.healthify.consultation.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ConsultationRepo extends JpaRepository<Consultation, Long>{

    Optional<Consultation> findByAppointmentId(Long appointmentId);
    <List>Consultation findByAppointmentPatientIdOrderByConsultationDateDesc(Long patientId);
}
