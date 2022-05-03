import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Enter a string of text: ");
        String stringInput = scanner.nextLine();

        System.out.println("Enter an integer: ");
        int intInput = scanner.nextInt();

        System.out.println("Enter a double: ");
        Double doubleInput = scanner.nextDouble();

        System.out.println("Enter a boolean value: ");
        Boolean booleanInput = scanner.nextBoolean();

        System.out.println("Your string is " + stringInput);

        System.out.println("Your integer is " + intInput);

        System.out.println("Your double is " + doubleInput);

        System.out.println("Your boolean is " + booleanInput);
        
    }
}
