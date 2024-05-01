package kz.kenzhakhimov.uniPortal.controllers;

import kz.kenzhakhimov.uniPortal.services.UserService;
import kz.kenzhakhimov.uniPortal.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user-api")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{email}")
    public User getUser(@PathVariable("email") String email){
        return  userService.findByUsername(email);
    }
}
