import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to Palindrome Checker App");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String input = sc.nextLine();
                    String cleaned = input.replaceAll("\\s+", "").toLowerCase();
                    String reversed = new StringBuilder(cleaned).reverse().toString();

                    if (cleaned.equals(reversed)) {
                        System.out.println("It is a Palindrome");
                    } else {
                        System.out.println("It is not a Palindrome");
                    }
                    break;

                case 2:
                    System.out.println("Exiting Application");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println();
        } while (choice != 2);

        sc.close();
    }
}
