package com.bunkrtech.website.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by jkratz on 4/23/17.
 */
@RunWith(JUnit4.class)
public class ParameterServiceTest {

    @Test
    public void testGetParameter() {
        String name = getParameter("HELLO", String.class);
        System.out.println(name);
    }

    private <T> T getParameter(String paramName, Class<T> clazz) {
        return (T) paramName;
    }
}
