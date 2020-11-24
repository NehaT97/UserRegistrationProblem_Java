package UserRegistration;
import java.util.Scanner;
public class UserRegistration {
    Scanner sc=new Scanner(System.in);

    /* UC1: Validate First Name  */
    private void ValidfirstName() {
        System.out.println("Enter The First Name");
        String firstname=sc.nextLine();
        if (firstname.matches("^[A-Z]{1}[a-z]{2,}"))
            System.out.println("Valid FirstName");
        else
            System.out.println("Invalid FirstName");
    }

    /* UC2: Validate Last Name  */
    private void ValidlastName() {
        System.out.println("Enter The Last Name");
        String lastname=sc.nextLine();
        if (lastname.matches("[A-Z]{1}[a-z]{2,}"))
            System.out.println("Valid lastName");
        else
            System.out.println("Invalid LastName");
    }

    /* UC1: Validate EmailId  */
    private void validEmail() {
        System.out.println("Enter The Email Id");
        String emailid=sc.nextLine();
        if (emailid.matches("^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))
            System.out.println("Valid EmailId");
        else
            System.out.println("Invalid EmailId");
    }

    public static void main(String []args){
        UserRegistration userregistration=new UserRegistration();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("\n-------WELCOME TO USER REGISTRATION--------");
            System.out.println("\nSelect Any Case To Validate" + "\n1. FirstName" + "\n2. LastName" + "\n3. Email");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    userregistration.ValidfirstName();
                    break;
                case 2:
                    userregistration.ValidlastName();
                    break;
                case 3:
                    userregistration.validEmail();
                    break;
                default:
                    System.out.println("Quit");
            }
        }
    }
}
