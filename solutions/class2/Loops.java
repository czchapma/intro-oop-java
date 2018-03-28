public class Loops {
    public static void main(String[] args) {
        //Assignment 1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        int numToPrint = 2;
        while(numToPrint <= 10) {
            System.out.println(numToPrint);
            numToPrint += 2;
        }

        //Bonus assignment 1
        System.out.println("Bonus:\n");
        int fib1 = 1;
        int fib2 = 1;
        System.out.println(fib1);
        System.out.println(fib2);
        for (int i = 0; i < 28; i++) {
            int sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            System.out.println(sum);
        }

        for (int i = 1; i <= 25; i++) {
            System.out.println((int) Math.pow(i, 2));
        }

        int count = 0;
        fib1 = 1;
        fib2 = 1;
        int sum = 0;
        while (count != 10) {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            if (sum % 2 == 0) {
                count++;
            }
        }
        System.out.println("The tenth even fibonacci number is: " + sum);
    }
}
