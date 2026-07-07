package App1;
public class App1 {
    public static void main(String[] args) {
        int numberArgs = args.length;
        

        String firstName;
        String lastName;

        if (numberArgs == 2) {
            firstName = args[0];
            lastName = args[1];
        } else {
            firstName = "Shauna";
            lastName = "Molloy";
        }

        System.out.println("Greetings " + firstName + " " + lastName);
        System.out.println(lastName.length());
        System.out.println("Hello World!");
        System.out.println("=============");
        // show output My first name is  Tom which has 3 characters
        int firstNameLength = firstName.length();
        System.out.println(String.format("My first name is %s %nWhich has %d characters", firstName, firstNameLength));
    }
}