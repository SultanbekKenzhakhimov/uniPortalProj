package kz.kenzhakhimov.uniPortal.controllers;
import kz.kenzhakhimov.uniPortal.entities.University;
import kz.kenzhakhimov.uniPortal.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/university-api")
public class UniversityController {
    @Autowired
    private UniversityService universityService;
    @GetMapping
    public List<University> getAllUniversities(){
        return universityService.getAllUniversities();
    }
    @GetMapping("/search")
    public List<University> getUniversitiesByName(@RequestParam("uni-name") String name){
        return universityService.getUniversitiesByName(name);
    }
}
