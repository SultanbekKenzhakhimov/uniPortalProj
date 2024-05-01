package kz.kenzhakhimov.uniPortal.repositories;

import jakarta.transaction.Transactional;
import kz.kenzhakhimov.uniPortal.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface FacultyRepository extends JpaRepository<Faculty,Long> {
    List<Faculty> findAllByUniversityIdEquals(Long id);
}
