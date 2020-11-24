package UserRegistration;
import java.util.Scanner;
public class UserRegistration {
Scanner sc=new Scanner(System.in);

    private void firstName() {
        System.out.println("Enter the First Name");
        String firstName=sc.nextLine();
        if (firstName.matches("^[A-Z]{1}[a-z]{2,}"))
            System.out.println("Valid FirstName");
        else
            System.out.println("Invalid FirstName");
    }
    
    public static void main(String []args){
        System.out.println("WELCOME TO USER REGISTRATION");
        UserRegistration userregistration=new UserRegistration();
        userregistration.firstName();

    }
}
