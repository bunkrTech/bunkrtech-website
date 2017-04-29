package com.bunkrtech.website.service.impl;

import com.bunkrtech.website.model.ParameterException;
import com.bunkrtech.website.persistence.jooq.tables.records.AppParameterRecord;
import com.bunkrtech.website.service.ParameterService;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.bunkrtech.website.persistence.jooq.Tables.APP_PARAMETER;

/**
 * Created by jkratz on 4/23/17.
 */
@Service
@Lazy
public class JooqParameterService implements ParameterService {

    private static final Logger logger = LoggerFactory.getLogger(JooqParameterService.class);

    private final DSLContext jooq;

    @Autowired
    public JooqParameterService(DSLContext dslContext) {
        this.jooq = dslContext;
    }

    @Override
    public Map<String, String> getAllParameters() {
        HashMap<String, String> paramMap = new HashMap<>();
        List<AppParameterRecord> result = this.jooq.selectFrom(APP_PARAMETER).fetch();
        result.forEach(record -> {
            paramMap.put(record.getParamName(), record.getParamValue());
        });
        return paramMap;
    }

    @Override
    public String getParameter(String paramName, String defaultValue) {
        try {
            Optional<String> paramValue = this.findParamByName(paramName);
            if (paramValue.isPresent()) {
                return paramValue.get();
            } else {
                return defaultValue;
            }
        } catch (Exception ex) {
            throw new ParameterException("An error occurred fetching parameter from database", ex);
        }
    }

    @Override
    public Integer getParameterAsInt(String paramName, Integer defaultValue) {
        try {
            Optional<String> paramValue = this.findParamByName(paramName);
            return paramValue.map(value -> Integer.parseInt(value)).orElse(defaultValue);
        } catch (Exception ex) {
            throw new ParameterException("An error occurred fetching parameter from database", ex);
        }
    }

    @Override
    public Long getParameterAsLong(String paramName, Long defaultValue) {
        try {
            Optional<String> paramValue = this.findParamByName(paramName);
            return paramValue.map(value -> Long.parseLong(value)).orElse(defaultValue);
        } catch (Exception ex) {
            throw new ParameterException("An error occurred fetching parameter from database", ex);
        }
    }

    @Override
    public Double getParameterAsDouble(String paramName, Double defaultValue) {
        try {
            Optional<String> paramValue = this.findParamByName(paramName);
            return paramValue.map(value -> new Double(value)).orElse(defaultValue);
        } catch (Exception ex) {
            throw new ParameterException("An error occurred fetching parameter from database", ex);
        }
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
        try {
            Optional<String> paramValue = this.findParamByName(paramName);
            return paramValue.map(value -> Boolean.parseBoolean(value)).orElse(defaultValue);
        } catch (Exception ex) {
            throw new ParameterException("An error occurred fetching parameter from database", ex);
        }
    }

    @Override
    public BigDecimal getParameterAsBigDecimal(String paramName, BigDecimal defaultValue) {
        try {
            Optional<String> paramValue = this.findParamByName(paramName);
            return paramValue.map(value -> new BigDecimal(value)).orElse(defaultValue);
        } catch (Exception ex) {
            throw new ParameterException("An error occurred fetching parameter from database", ex);
        }
    }

    private Optional<String> findParamByName(String paramName) {
        return this.jooq.select(APP_PARAMETER.PARAM_VALUE)
                .from(APP_PARAMETER)
                .where(APP_PARAMETER.PARAM_NAME.upper().equal(paramName.toUpperCase()))
                .fetchOptional(APP_PARAMETER.PARAM_VALUE);
    }
}
