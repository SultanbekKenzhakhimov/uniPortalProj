package kz.kenzhakhimov.uniPortal.services.impl;

import kz.kenzhakhimov.uniPortal.services.UserService;
import kz.kenzhakhimov.uniPortal.user.User;
import kz.kenzhakhimov.uniPortal.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByUsername(String username) {
        return userRepository.findAllByEmail(username);
    }
}
