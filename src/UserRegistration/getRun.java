package UserRegistration;
import java.util.Scanner;

public class getRun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person person = new Person();
        UserRegistration validate = new UserRegistration();
        boolean loop=true;
        while (loop==true) {
            System.out.println("-----WELCOME TO USER REGISTRATION PROGRAM-----");
            System.out.println("\nSelect Any Case To Validate" + "\n1. FirstName" + "\n2. LastName" + "\n3. Email"
                    + "\n4. MobileNumber" + "\n5. Password" + "\n6. ValidAllEmails" + "\n7. Quit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    validate.validFirstName(person);
                    break;
                case 2:
                    validate.validLastName(person);
                    break;
                case 3:
                    validate.validEmailId(person);
                    break;
                case 4:
                    validate.validPhoneNumber(person);
                    break;
                case 5:
                    validate.validPasswordRuleOne(person);
                    break;
                case 6:
                    validate.validAllEmail(UserRegistration.inValidEmailIds);
                    break;
                case 7:
                    loop=false;
                default:
                    System.out.println("Quit");
            }
        }
    }
}

