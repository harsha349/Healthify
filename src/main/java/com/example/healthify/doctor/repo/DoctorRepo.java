package com.example.healthify.doctor.repo;
import com.example.healthify.doctor.entity.Doctor;
import com.example.healthify.enums.Specialization;
import com.example.healthify.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface DoctorRepo extends JpaRepository<Doctor, Long> {
    Optional<Doctor> findByUser(User user);
    List<Doctor> findBySpecialization(Specialization specialization);
}
