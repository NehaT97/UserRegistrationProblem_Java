package com.userregistrationvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    Person person = new Person();
    static String patternFirstAndLastName = "^[A-Z]{1}[a-zA-Z]{2,}$";
    static String patternEmailId = "^[a-zA-Z][a-zA-Z0-9_\\-+]*[.]{0,1}[a-zA-Z0-9_\\-+]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,}[.]{0,}[a-zA-Z]*$";
    static String patternPhoneNumber = "^(\\+91|91)[ ]{1}[6-9]{1}[0-9]{9}$";
    static String patternPasswordAllRule = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    public static final String[] validEmailIds = new String[]{"abc@yahoo.com", "abc-100@yahoo.com",
            "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com",
            "abc@gmail.com.com", "abc+100@gmail.com"};

    public static final String[] inValidEmailIds = new String[]{"abc@.com.my", "abc123@gmail.a", "abc123@.com",
            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};


    /* UC1: Validate First Name  */
    public  boolean validFirstName(String firstName) {
        Pattern pattern = Pattern.compile(patternFirstAndLastName);
        Matcher match = pattern.matcher(firstName);
        if (match.matches()) {
            System.out.println("Valid FirstName");
        } else
            System.out.println("Invalid FirstName");
        return true;
    }

    /* UC2: Validate Last Name  */
    public boolean validLastName(String lastName) {
        Pattern pattern = Pattern.compile(patternFirstAndLastName);
        Matcher match = pattern.matcher(lastName);
        if (match.matches()) {
            System.out.println("Valid lastName");
        } else
            System.out.println("Invalid LastName");
        return true;
    }

    /* UC3: Validate EmailId  */
    public boolean validEmailId(String emailId) {
        Pattern pattern = Pattern.compile(patternEmailId);
        Matcher match = pattern.matcher(emailId);
        if (match.matches()) {
            System.out.println("Valid EmailId ");
        } else
            System.out.println("Invalid EmailId");
        return true;
    }

    /* UC4: Validate MobileNumber  */
    public boolean validPhoneNumber(String phoneNo) {
        Pattern pattern = Pattern.compile(patternPhoneNumber);
        Matcher match = pattern.matcher(phoneNo);
        if (match.matches()) {
            System.out.println("Valid PhoneNumber ");
        } else
            System.out.println("Invalid PhoneNumber");
        return true;
    }

    /* UC5: Validate Password With All Rule*/
    public boolean validPasswordAllRule(String password) {
        Pattern pattern = Pattern.compile(patternPasswordAllRule);
        Matcher match = pattern.matcher(password);
        if (match.matches()) {
            System.out.println("Valid password ");
        } else
            System.out.println("Invalid password");
        return true;
    }

    /* UC9_All Valid Emails */
    public void validAllEmail(String[] emails) {
        String email = null;
        System.out.println(emails.length);
        for (int i = 0; i < emails.length; i++) {
            email = emails[i];
            Pattern pattern = Pattern.compile(patternEmailId);
            Matcher Match = pattern.matcher(email);
            if (Match.matches()) {
                System.out.println(email + " : Email Validated");
            } else
                System.out.println(email + " : Invalid email ID");
        }
    }
}

