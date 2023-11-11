import java.util.Scanner;

public class question1assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        performActions(n);
    }

    static void performActions(int n) {
        if (n % 2 != 0) {
            System.out.println("Hello");
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Welcome");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Hello");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Welcome");
        }
    }
}
