public class MathDemo {

    // a. min method
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // b. max method
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // c. sum method
    public static int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Min: " + min(a, b));
        System.out.println("Max: " + max(a, b));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + sum(numbers));
    }
}
