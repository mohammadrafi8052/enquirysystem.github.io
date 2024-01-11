package com.employee.enquiry.system.Repository;

import com.employee.enquiry.system.model.enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enquiryRepository extends JpaRepository<enquiry,Integer> {

    enquiry getEnquiryByMobileNumber(String MobileNumber);

}
