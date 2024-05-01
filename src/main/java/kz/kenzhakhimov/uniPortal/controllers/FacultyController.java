package kz.kenzhakhimov.uniPortal.controllers;

import kz.kenzhakhimov.uniPortal.entities.Faculty;
import kz.kenzhakhimov.uniPortal.services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculty-api")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;
    @GetMapping
    public List<Faculty> getAllFaculties(){
        return facultyService.getAllFaculties();
    }
    @GetMapping("/{uniId}")
    public List<Faculty> getFacultiesByUniversityId(@PathVariable("uniId") Long universityId){
        return facultyService.getFacultiesByUniversityId(universityId);
    }
}
