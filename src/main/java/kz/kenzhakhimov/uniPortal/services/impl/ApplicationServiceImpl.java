package kz.kenzhakhimov.uniPortal.services.impl;

import kz.kenzhakhimov.uniPortal.entities.Application;
import kz.kenzhakhimov.uniPortal.repositories.ApplicationRepository;
import kz.kenzhakhimov.uniPortal.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;
    @GetMapping
    public List<Application> getAllApplications(){
        return applicationRepository.findAll();
    }

    @Override
    public Application addApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public Application getApplicationById(Long appId) {
        return applicationRepository.findAllById(appId);
    }

    @Override
    public Application updateApplication(Application application) {
        return applicationRepository.save(application);
    }
}
