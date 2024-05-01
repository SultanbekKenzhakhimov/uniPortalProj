package kz.kenzhakhimov.uniPortal.services;

import kz.kenzhakhimov.uniPortal.entities.Specialization;

import java.util.List;

public interface SpecializationService {
    List<Specialization> getAllSpecializations();
    List<Specialization> getSpecializationsByFacultyId(Long facId);
    Specialization getSpecializationById(Long id);
}
