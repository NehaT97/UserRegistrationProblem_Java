package UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    Person person = new Person();

    static String patternFirstName = "^[A-Z]{1}[a-zA-Z]{2,}$";


    /* UC1: Validate First Name  */
    public void validFirstName(Person person) {
        while (true) {
            System.out.println("Enter The First Name");
            String firstName = sc.nextLine();
            Pattern pattern = Pattern.compile(patternFirstName);
            Matcher match = pattern.matcher(firstName);
            if (match.matches()) {
                System.out.println("Valid FirstName");
            }
            else
                System.out.println("Invalid FirstName");
        }
    }
}