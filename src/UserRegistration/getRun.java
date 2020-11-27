package UserRegistration;

public class getRun {
    public static void main(String args[]){
        System.out.println("WELCOME TO USER REGISTRATION PROGRAM");
        Person person=new Person();
        UserRegistration validate=new UserRegistration();
        validate.validFirstName(person);
    }
}
