import java.util.Scanner;

public class Lab2P5 {
    public static void main(String...args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No.:");
        int a = s.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && a > 1) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }
    }
}