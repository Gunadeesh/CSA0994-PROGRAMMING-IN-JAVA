public class questionb3assignment1 {

    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
