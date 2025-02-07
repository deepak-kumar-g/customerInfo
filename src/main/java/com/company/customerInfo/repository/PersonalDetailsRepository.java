package com.company.customerInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.customerInfo.entity.PersonalDetails;


@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Integer> {

}
