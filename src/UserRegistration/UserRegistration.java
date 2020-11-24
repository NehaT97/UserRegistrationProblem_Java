package UserRegistration;
import java.util.Scanner;
public class UserRegistration {
    Scanner sc;

    /* UC1: Validate First Name  */
    private void firstName() {
        sc=new Scanner(System.in);
        System.out.println("Enter The First Name");
        String firstname=sc.nextLine();
        if (firstname.matches("^[A-Z]{1}[a-z]{2,}"))
            System.out.println("Valid FirstName");
        else
            System.out.println("Invalid FirstName");
    }

    /* UC2: Validate Last Name  */
    private void lastName(){
        sc=new Scanner(System.in);
        System.out.println("Enter The Last Name");
        String lastname=sc.nextLine();
        if (lastname.matches("[A-Z]{1}[a-z]{2,}"))
            System.out.println("Valid lastName");
        else
            System.out.println("Invalid LastName");
    }

    public static void main(String []args){
        UserRegistration userregistration=new UserRegistration();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("WELCOME TO USER REGISTRATION");
            System.out.println("\nSelect Any Case To Validate" + "\n1. FirstName" + "\n2. LastName");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    userregistration.firstName();
                    break;
                case 2:
                    userregistration.lastName();
                    break;
                default:
                    System.out.println("Quit");
            }
        }
    }
}
