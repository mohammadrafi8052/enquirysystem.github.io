package com.employee.enquiry.system.service;

import com.employee.enquiry.system.model.enquiry;

public interface service {
     enquiry createEnquiry(enquiry enq);

     enquiry getByMobileNumber(String MobileNumber);

}
