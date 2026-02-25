import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Reverse Method: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println("\nTwo Pointer Method: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        sc.close();
    }
}