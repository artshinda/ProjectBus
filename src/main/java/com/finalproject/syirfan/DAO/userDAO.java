package com.finalproject.syirfan.DAO;

import com.finalproject.syirfan.Entity.agency;
import com.finalproject.syirfan.Entity.user;
import com.finalproject.syirfan.Request.registerRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userDAO extends JpaRepository<user,String> {

}