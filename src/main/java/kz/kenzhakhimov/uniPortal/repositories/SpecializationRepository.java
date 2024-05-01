package kz.kenzhakhimov.uniPortal.repositories;

import jakarta.transaction.Transactional;
import kz.kenzhakhimov.uniPortal.entities.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface SpecializationRepository extends JpaRepository<Specialization,Long> {
    List<Specialization> findAllByFacultyIdEquals(Long facId);
    Specialization findAllById(Long id);
}
