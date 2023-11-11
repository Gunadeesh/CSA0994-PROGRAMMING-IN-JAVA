public class question2assignment1 {

    public static void main(String[] args) {
        int a = 12;
        int b = 45;

        // Check if 'a' is less than 10
        boolean condition1 = a < 10;

        // Check if 'a' is less than 'b'
        boolean condition2 = a < b;

        // Print the results
        System.out.println("Condition 'a < 10' is " + condition1);
        System.out.println("Condition 'a < b' is " + condition2);

        // Check if both conditions are true
        if (condition1 && condition2) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one of the conditions is false.");
        }
    }
}
