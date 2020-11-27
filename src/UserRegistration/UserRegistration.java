package UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    static String patternFirstAndLastName = "^[A-Z]{1}[a-zA-Z]{2,}$";

    /* UC1: Validate First Name  */
    public void validFirstName(Person person) {
        System.out.println("Enter The First Name");
        String firstName = sc.nextLine();
        Pattern pattern = Pattern.compile(patternFirstAndLastName);
        Matcher match = pattern.matcher(firstName);
        if (match.matches()) {
            System.out.println("Valid FirstName");
        }
        else
            System.out.println("Invalid FirstName");
            quit();
     }

    /* UC2: Validate Last Name  */
    public void validLastName(Person person) {
        System.out.println("Enter The Last Name");
        String lastName = sc.nextLine();
        Pattern pattern = Pattern.compile(patternFirstAndLastName);
        Matcher match = pattern.matcher(lastName);
        if (match.matches()) {
            System.out.println("Valid lastName");
        }
        else
            System.out.println("Invalid LastName");
            quit();
    }

    public void validEmailId(Person person) {
    }

    public void validMobileNumber(Person person) {
    }

    public void validPasswordRuleOne(Person person) {
    }

    public void quit() {
        Boolean loop = true;
        while (loop == true) {
            String input = "y";
            System.out.println("Want to continue(y | n)");
            String ans = sc.nextLine();
            if (ans.equals(input)) {
                return;
            } else
                loop = false;
        }
    }
}