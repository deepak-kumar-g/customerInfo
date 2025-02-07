package com.company.customerInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.customerInfo.entity.AddressDetails;


@Repository
public interface AddressDetailsRepository extends JpaRepository<AddressDetails, Integer>{

}
