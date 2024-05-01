package kz.kenzhakhimov.uniPortal.controllers;
import kz.kenzhakhimov.uniPortal.entities.Specialization;
import kz.kenzhakhimov.uniPortal.services.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/specialization-api")
public class SpecializationController {
    @Autowired
    private SpecializationService specializationService;
    @GetMapping
    public List<Specialization> getAllSpecializations(){
        return specializationService.getAllSpecializations();
    }
    @GetMapping("/faculty/{facId}")
    public List<Specialization> getSpecializationsByFacultyId(@PathVariable("facId") Long facId){
        return specializationService.getSpecializationsByFacultyId(facId);
    }
    @GetMapping("/{specId}")
    public Specialization getSpecialization(@PathVariable("specId") Long id){
        return specializationService.getSpecializationById(id);
    }
}
