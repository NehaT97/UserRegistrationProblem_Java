package com.userregistrationvalidation;

import com.userregistrationvalidation.exceptions.ValidationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationChecker {

    private String emailId;

    private UserRegistration userRegistration;

    @Before
    public void init() {
       this.userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection emailIds() {
        return Arrays.asList("abc@yahoo.com", "abc-100@yahoo.com",
                "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com",
                "abc@gmail.com.com", "abc+100@gmail.com", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au");
    }

    public EmailValidationChecker(String emailId) {
        this.emailId = emailId;
    }

    @Test
    public void validateEmailId() {
        try {
            System.out.println("Email Id to validate : "+ this.emailId);
            boolean result = userRegistration.validEmailId(emailId);
            Assert.assertEquals(true, result);
        } catch (ValidationException ex) {
            return;
        }
    }

}
