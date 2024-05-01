package kz.kenzhakhimov.uniPortal.services;


import kz.kenzhakhimov.uniPortal.user.User;

public interface UserService {
    public User findByUsername(String username);
}
