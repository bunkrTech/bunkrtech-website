package com.bunkrtech.website.service.impl;

import com.bunkrtech.website.service.ParameterService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * Created by jkratz on 4/23/17.
 */
@Service
@Lazy
public class JooqParameterService implements ParameterService {

    private final DSLContext jooq;

    @Autowired
    public JooqParameterService(DSLContext dslContext) {
        this.jooq = dslContext;
    }

    @Override
    public Map<String, String> getAllParameters() {
        return null;
    }

    @Override
    public String getParameter(String paramName, String defaultValue) {
        return null;
    }

    @Override
    public Integer getParameterAsInt(String paramName, Integer defaultValue) {
        return null;
    }

    @Override
    public Long getParameterAsLong(String paramName, Long defaultValue) {
        return null;
    }

    @Override
    public Double getParameterAsDouble(String paramName, Double defaultValue) {
        return null;
    }

    @Override
    public LocalDate getParameterAsDate(String paramName, LocalDate defaultValue) {
        return null;
    }

    @Override
    public LocalDateTime getParameterAsDateTime(String paramName, LocalDateTime defaultValue) {
        return null;
    }

    @Override
    public Boolean getParameterAsBool(String paramName, Boolean defaultValue) {
        return null;
    }

    @Override
    public BigDecimal getParameterAsBigDecimal(String paramName, BigDecimal defaultValue) {
        return null;
    }
}
