package com.bunkrtech.website.service;

import com.bunkrtech.website.model.ParameterException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * Service for retrieving application parameters
 *
 * @author Joseph Kratz
 * @since 1.0
 */
public interface ParameterService {

    /**
     * Gets all parameters as Map of Parameter Name, Parameter Value
     *
     * @return Map of parameters
     * @throws ParameterException
     */
    public Map<String, String> getAllParameters() throws ParameterException;

    /**
     *
     * @param paramName Name of the parameter
     * @param defaultValue Default value to be used if parameter is not found
     * @return Parameter value as String
     * @throws ParameterException
     */
    public String getParameter(String paramName, String defaultValue) throws ParameterException;

    /**
     *
     * @param paramName Name of the parameter
     * @param defaultValue Default value to be used if parameter is not found
     * @return Parameter value as Integer
     * @throws ParameterException
     */
    public Integer getParameterAsInt(String paramName, Integer defaultValue) throws ParameterException;

    /**
     *
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ParameterException
     */
    public Long getParameterAsLong(String paramName, Long defaultValue) throws ParameterException;

    /**
     *
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ParameterException
     */
    public Double getParameterAsDouble(String paramName, Double defaultValue) throws ParameterException;

    /**
     *
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ParameterException
     */
    public LocalDate getParameterAsDate(String paramName, LocalDate defaultValue) throws ParameterException;

    /**
     *
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ParameterException
     */
    public LocalDateTime getParameterAsDateTime(String paramName, LocalDateTime defaultValue) throws ParameterException;

    /**
     *
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ParameterException
     */
    public Boolean getParameterAsBool(String paramName, Boolean defaultValue) throws ParameterException;

    /**
     *
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ParameterException
     */
    public BigDecimal getParameterAsBigDecimal(String paramName, BigDecimal defaultValue) throws ParameterException;
}
