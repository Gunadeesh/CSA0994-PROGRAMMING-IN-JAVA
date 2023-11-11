public class questiona3assignment1 {

    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Using a third variable to swap values
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
