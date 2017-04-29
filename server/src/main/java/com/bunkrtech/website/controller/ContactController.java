package com.bunkrtech.website.controller;

import com.bunkrtech.website.model.ContactForm;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by jkratz on 4/27/17.
 */
@RestController
@RequestMapping(path = "/contact", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContactController {

    @PostMapping
    public ResponseEntity<?> handleContactUsSubmission(@Valid ContactForm contactForm) {

        return ResponseEntity.ok("");
    }
}
