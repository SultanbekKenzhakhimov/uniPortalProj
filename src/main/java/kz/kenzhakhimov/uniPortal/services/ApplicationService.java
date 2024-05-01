package kz.kenzhakhimov.uniPortal.services;


import kz.kenzhakhimov.uniPortal.entities.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> getAllApplications();
    Application addApplication(Application application);
    Application getApplicationById(Long appId);
    Application updateApplication(Application application);
}
