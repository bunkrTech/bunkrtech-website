package com.bunkrtech.website.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by jkratz on 4/27/17.
 */
public class ContactForm implements Serializable {

    @NotBlank
    @Size(max = 255)
    private String contactName;

    @Size(max = 255)
    private String companyName;

    @NotBlank
    @Email
    @Size(max = 255)
    private String emailAddress;

    @NotBlank
    @Size(max = 20)
    private String phoneNumber;

    @NotBlank
    private String projectDescription;
}
