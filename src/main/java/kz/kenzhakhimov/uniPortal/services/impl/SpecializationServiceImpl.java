package kz.kenzhakhimov.uniPortal.services.impl;

import kz.kenzhakhimov.uniPortal.entities.Specialization;
import kz.kenzhakhimov.uniPortal.repositories.SpecializationRepository;
import kz.kenzhakhimov.uniPortal.services.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationServiceImpl implements SpecializationService {
    @Autowired
    private SpecializationRepository specializationRepository;
    @Override
    public List<Specialization> getAllSpecializations() {
        return specializationRepository.findAll();
    }

    @Override
    public List<Specialization> getSpecializationsByFacultyId(Long facId) {
        return specializationRepository.findAllByFacultyIdEquals(facId);
    }

    @Override
    public Specialization getSpecializationById(Long id) {
        return specializationRepository.findAllById(id);
    }


}
