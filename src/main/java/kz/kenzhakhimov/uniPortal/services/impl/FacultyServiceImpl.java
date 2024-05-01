package kz.kenzhakhimov.uniPortal.services.impl;

import kz.kenzhakhimov.uniPortal.entities.Faculty;
import kz.kenzhakhimov.uniPortal.repositories.FacultyRepository;
import kz.kenzhakhimov.uniPortal.services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public List<Faculty> getFacultiesByUniversityId(Long id) {
        return facultyRepository.findAllByUniversityIdEquals(id);
    }
}
