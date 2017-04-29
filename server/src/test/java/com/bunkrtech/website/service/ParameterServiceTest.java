package com.bunkrtech.website.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import java.util.Map;

/**
 * Created by jkratz on 4/23/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ParameterServiceTest {

    @Autowired
    private ParameterService parameterService;

    @Test
    public void testGetParameterMap() {
        Map<String, String> results = this.parameterService.getAllParameters();
        assertTrue(results.size() > 0);
        results.forEach((k, v) -> {
            System.out.println(String.format("ParamName: %s, ParamValue: %s", k, v));
        });
    }

    @Test
    public void testGetParameter() {
        String value = this.parameterService.getParameter("EnableContactUs", null);
        assertTrue(value.equals("1"));
    }

    @Test
    public void testGetParameterDefaultValue() {
        String value = this.parameterService.getParameter("FAIL", "Default");
        assertTrue(value.equals("Default"));
    }

    @Test
    public void testGetParameterAsBool() {
        Boolean value = this.parameterService.getParameterAsBool("EnableContactUs", Boolean.TRUE);
        assertTrue(value);
    }
}
