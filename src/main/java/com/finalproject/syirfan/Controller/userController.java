package com.finalproject.syirfan.Controller;

import com.finalproject.syirfan.DAO.agencyDAO;
import com.finalproject.syirfan.DAO.roleDAO;
import com.finalproject.syirfan.DAO.userDAO;
import com.finalproject.syirfan.Entity.agency;
import com.finalproject.syirfan.Entity.user;
import com.finalproject.syirfan.Request.registerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Timestamp;

@RestController
public class userController {

    @Autowired
    private userDAO userDAO;

    @Autowired
    private agencyDAO agencyDAO;

    @Autowired
    private roleDAO roleDAO;

    @PostMapping("/createNewAccount")
    public String createNewAccount(@RequestBody registerRequest registerRequest) {

        user us = new user();
        us.setFirstName(registerRequest.getFirstName());
        us.setLastName(registerRequest.getLastName());
        us.setEmail(registerRequest.getEmail());
        us.setMobileNumber(registerRequest.getMobileNumber());
        us.setPassword(registerRequest.getPassword());
        us.setRoles(roleDAO.findIdByRole("Owner").getId());
        userDAO.save(us);

        agency ag = new agency();
        ag.setName(registerRequest.getAgencyName());
        ag.setDetails(registerRequest.getAgencyDetail());
        agencyDAO.save(ag);

        return "login";
    }

}
