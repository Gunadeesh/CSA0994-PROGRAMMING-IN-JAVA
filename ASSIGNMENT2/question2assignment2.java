import java.util.Scanner;

public class question2assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Validate that the number is a 3-digit number
        if (number >= 100 && number <= 999) {
            // Reverse the number
            int reversedNumber = reverseNumber(number);

            // Output the result
            System.out.println("Reversed Number: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
    }

    // Function to reverse a 3-digit number
    static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
