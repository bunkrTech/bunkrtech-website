package com.bunkrtech.website.controller;

import com.bunkrtech.website.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jkratz on 4/23/17.
 */
@RestController
@RequestMapping(path = "/parameter", produces = MediaType.APPLICATION_JSON_VALUE)
public class ParameterController {

    private final ParameterService parameterService;

    @Autowired
    public ParameterController(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @Cacheable(cacheNames = "parameterCache")
    @GetMapping
    public ResponseEntity<?> getParameters() {
        return ResponseEntity.ok("");
    }

    @GetMapping("/{paramName}")
    public ResponseEntity<?> getParameterValue(@PathVariable("paramName") String paramName) {
        return ResponseEntity.ok("T");
    }
}
