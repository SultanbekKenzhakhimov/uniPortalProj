package kz.kenzhakhimov.uniPortal.services;

import kz.kenzhakhimov.uniPortal.entities.University;

import java.util.List;

public interface UniversityService {
    List<University> getAllUniversities();
    List<University> getUniversitiesByName(String name);
}
