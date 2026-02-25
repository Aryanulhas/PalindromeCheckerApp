public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String input = "madam";

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}