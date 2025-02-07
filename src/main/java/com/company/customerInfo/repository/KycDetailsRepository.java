package com.company.customerInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.customerInfo.entity.KycDetails;


@Repository
public interface KycDetailsRepository extends JpaRepository<KycDetails, Integer>{

}
