package com.finalproject.syirfan.DAO;

import com.finalproject.syirfan.Entity.agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface agencyDAO extends JpaRepository<agency,String> {

}