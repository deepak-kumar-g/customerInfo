package com.company.customerInfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.customerInfo.entity.AddressDetails;
import com.company.customerInfo.entity.KycDetails;
import com.company.customerInfo.entity.PersonalDetails;
import com.company.customerInfo.repository.AddressDetailsRepository;
import com.company.customerInfo.repository.KycDetailsRepository;
import com.company.customerInfo.repository.PersonalDetailsRepository;
import com.company.customerInfo.requestDTO.CustomerRequestInfo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private PersonalDetailsRepository PersonalDetailsRepo;
	
	@Autowired
	private AddressDetailsRepository AddressDetailsRepo;
	
	@Autowired
    private KycDetailsRepository KycDetailsRepo;
	
	public void saveCustomerInfo(CustomerRequestInfo RequestInfo) {
		
		//Save Personal Details
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setFirstName(RequestInfo.getFirstName());
		personalDetails.setLastName(RequestInfo.getLastName());
		personalDetails.setEmail(RequestInfo.getEmail());
		personalDetails.setPhoneNumber(RequestInfo.getPhoneNumber());
		personalDetails = PersonalDetailsRepo.save(personalDetails);
		
		// Save Address Details
        AddressDetails addressDetails = new AddressDetails();
        addressDetails.setStreet(RequestInfo.getStreet());
        addressDetails.setCity(RequestInfo.getCity());
        addressDetails.setState(RequestInfo.getState());
        addressDetails.setZipCode(RequestInfo.getZipCode());
        addressDetails.setPersonalDetailsId(personalDetails.getId()); // Foreign key reference
        AddressDetailsRepo.save(addressDetails);

        // Save KYC Details
        KycDetails kycDetails = new KycDetails();
        kycDetails.setDocumentType(RequestInfo.getDocumentType());
        kycDetails.setDocumentNumber(RequestInfo.getDocumentNumber());
        kycDetails.setPersonalDetailsId(personalDetails.getId()); // Foreign key reference
        KycDetailsRepo.save(kycDetails);
    }
		
	

	
	
	
	
}
