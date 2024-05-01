package kz.kenzhakhimov.uniPortal.repositories;

import jakarta.transaction.Transactional;
import kz.kenzhakhimov.uniPortal.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface UniversityRepository extends JpaRepository<University,Long> {
    List<University> findAllByNameContainsIgnoreCase(String name);
}
