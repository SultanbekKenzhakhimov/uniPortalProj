package kz.kenzhakhimov.uniPortal.services.impl;

import kz.kenzhakhimov.uniPortal.entities.University;
import kz.kenzhakhimov.uniPortal.repositories.UniversityRepository;
import kz.kenzhakhimov.uniPortal.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    private UniversityRepository universityRepository;
    @Override
    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    @Override
    public List<University> getUniversitiesByName(String name) {
        return universityRepository.findAllByNameContainsIgnoreCase(name);
    }
}
