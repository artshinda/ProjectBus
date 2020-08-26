package com.finalproject.syirfan.Controller;

import com.finalproject.syirfan.DAO.userDAO;
import com.finalproject.syirfan.Entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @GetMapping
    @RequestMapping({"/","/index"})
    public String main() {

        return "index";
    }
}
