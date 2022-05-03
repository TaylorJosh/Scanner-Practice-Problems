import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String greeting = "Hi ";

        System.out.println("What's your name?");
        String Username = scanner.nextLine();
        System.out.println(greeting + Username);
    }
}