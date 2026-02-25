import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            deque.add(input.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.isPalindrome(input);
    }
}

public class UC12_StrategyPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("Choose: 1-Stack  2-Deque");
        int choice = sc.nextInt();

        if (choice == 1) {
            checker.setStrategy(new StackStrategy());
        } else {
            checker.setStrategy(new DequeStrategy());
        }

        if (checker.check(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}