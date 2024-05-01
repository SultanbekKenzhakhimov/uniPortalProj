package kz.kenzhakhimov.uniPortal.services;

import kz.kenzhakhimov.uniPortal.entities.Faculty;

import java.util.List;

public interface FacultyService {
    List<Faculty> getAllFaculties();
    List<Faculty> getFacultiesByUniversityId(Long id);
}
