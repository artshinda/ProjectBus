package com.finalproject.syirfan.security.service;

import com.finalproject.syirfan.DAO.userDAO;
import com.finalproject.syirfan.Entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private userDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        user user = userDAO.getUserByemail(email);

        if (user == null){
            throw new UsernameNotFoundException("Email Tidak Ditemukan");
        }

        return new MyUserDetails(user);
    }
}
