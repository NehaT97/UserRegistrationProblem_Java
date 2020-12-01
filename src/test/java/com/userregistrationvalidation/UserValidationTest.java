package com.userregistrationvalidation;
import com.userregistrationvalidation.exceptions.ValidationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidationTest {
    UserRegistration userregistration = new UserRegistration();

    @Before
    public void init() {
        System.out.println("-----WELCOME TO USER REGISTRATION PROGRAM-----");
    }

    @Test
    public void FirstName_Return_True() {
        boolean result = userregistration.validFirstName("Neha");
        Assert.assertEquals(true, result);
    }

    @Test(expected = ValidationException.class)
    public void FirstName_Return_False() {
        Boolean result = userregistration.validFirstName("neha");
        Assert.assertEquals(false, result);
    }

    @Test
    public void LastName_Return_True() {
        boolean result = userregistration.validLastName("Thakur");
        Assert.assertEquals(true, result);
    }

    @Test(expected = ValidationException.class)
    public void LastName_Return_False() {
        boolean result = userregistration.validLastName("thakur");
        Assert.assertEquals(true, result);
    }

    @Test
    public void PhoneNumber_Return_True() {
        boolean result = userregistration.validPhoneNumber("+91 6233445566");
        Assert.assertEquals(true, result);
    }

    @Test(expected = ValidationException.class)
    public void PhoneNumber_Return_False() {
        boolean result = userregistration.validPhoneNumber("2233445566");
        Assert.assertEquals(true, result);
    }

    @Test
    public void PassWord_Return_True() {
        boolean result = userregistration.validPasswordAllRule("Ne97ha@A");
        Assert.assertEquals(true, result);
    }

    @Test(expected = ValidationException.class)
    public void PassWord_Return_False() {
        boolean result = userregistration.validPasswordAllRule("Neha@A");
        Assert.assertEquals(true, result);
    }

    @Test(expected = ValidationException.class)
    public void PassWord_Return_False2() {
        boolean result = userregistration.validPasswordAllRule("password1");
        Assert.assertEquals(true, result);
    }

    @Test
    public void Email_Return_True() {
        boolean result = userregistration.validEmailId("abc@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test(expected = ValidationException.class)
    public void Email_Return_False1() {
        boolean result = userregistration.validEmailId("abc");
        Assert.assertEquals(true, result);
    }

    @Test(expected = ValidationException.class)
    public void Email_Return_False2() {
        boolean result = userregistration.validEmailId("abc.gmail.com");
        Assert.assertEquals(true, result);
    }
}