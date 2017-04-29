package com.bunkrtech.website.service.impl;

import com.bunkrtech.website.model.ContactForm;
import com.bunkrtech.website.model.ServiceDTO;
import com.bunkrtech.website.service.MarketingService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jkratz on 4/27/17.
 */
@Service
@Lazy
public class JooqMarketingService implements MarketingService {

    private final DSLContext jooq;

    @Autowired
    public JooqMarketingService(DSLContext dslContext) {
        this.jooq = dslContext;
    }

    @Override
    public void submitServiceInquiry(ContactForm contactForm) {

    }

    @Override
    public List<ServiceDTO> getServicesAvailable() {
        return null;
    }
}
