package kz.kenzhakhimov.uniPortal.repositories;

import jakarta.transaction.Transactional;
import kz.kenzhakhimov.uniPortal.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ApplicationRepository extends JpaRepository<Application,Long> {
    Application findAllById(Long appId);
}
