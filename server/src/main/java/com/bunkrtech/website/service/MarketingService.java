package com.bunkrtech.website.service;

import com.bunkrtech.website.model.ContactForm;
import com.bunkrtech.website.model.ServiceDTO;

import java.util.List;

/**
 * Created by jkratz on 4/27/17.
 */
public interface MarketingService {

    void submitServiceInquiry(ContactForm contactForm);

    List<ServiceDTO> getServicesAvailable();
}
