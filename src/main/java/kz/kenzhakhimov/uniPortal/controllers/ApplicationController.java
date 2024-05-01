package kz.kenzhakhimov.uniPortal.controllers;

import kz.kenzhakhimov.uniPortal.entities.Application;
import kz.kenzhakhimov.uniPortal.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/appl")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;
    @GetMapping
    public List<Application> getAllApplications(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            if (authorities.stream().anyMatch(a -> a.getAuthority().equals("ADMIN"))) {
                return applicationService.getAllApplications();
            }
        }
        // Если пользователь не имеет прав доступа, можно вернуть соответствующий статус или сообщение об ошибке
        throw new AccessDeniedException("Access denied");
    }

    @PostMapping
    public Application addApplication(@RequestBody Application application){
        return applicationService.addApplication(application);
    }
    @GetMapping("/{appId}")
    public Application getApplicationById(@PathVariable("appId") Long appId){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            if (authorities.stream().anyMatch(a -> a.getAuthority().equals("ADMIN"))) {
                return applicationService.getApplicationById(appId);
            }
        }
        // Если пользователь не имеет прав доступа, можно вернуть соответствующий статус или сообщение об ошибке
        throw new AccessDeniedException("Access denied");
    }
    @PutMapping
    public Application updateApplication(@RequestBody Application application){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            if (authorities.stream().anyMatch(a -> a.getAuthority().equals("ADMIN"))) {
                return applicationService.updateApplication(application);
            }
        }
        // Если пользователь не имеет прав доступа, можно вернуть соответствующий статус или сообщение об ошибке
        throw new AccessDeniedException("Access denied");
    }
}
