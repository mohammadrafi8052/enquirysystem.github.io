package com.employee.enquiry.system.service.serviceImp;

import com.employee.enquiry.system.Repository.enquiryRepository;
import com.employee.enquiry.system.model.enquiry;
import com.employee.enquiry.system.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class enquiryserviceImpl implements service {

    @Autowired
    enquiryRepository enqrepostory;
    @Override
    public enquiry createEnquiry(enquiry enq) {
        if(enqrepostory.getEnquiryByMobileNumber(enq.getMobileNumber())!=null){
             enqrepostory.deleteById(enq.getId());
        }
        return  enqrepostory.save(enq);
    }

    @Override
    public enquiry getByMobileNumber(String MobileNumber){
        return enqrepostory.getEnquiryByMobileNumber(MobileNumber);
    }
}
