import java.util.*;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    private static boolean check(String s, int start, int end) {

        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return check(s, start + 1, end - 1);
    }
}