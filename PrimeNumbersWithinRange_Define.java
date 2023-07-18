import java.util.Scanner;

public class PrimeNumbersWithinRange_Define {

    public static void main(String[] args) {

        // Get the lower and upper bounds of the range from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the lower bound range: ");
             int lowerBound = scanner.nextInt();
        System.out.println("Input the upper bound range: ");
             int upperBound = scanner.nextInt();

        // Initialize an array for storing prime numbers !
             boolean[] isPrime = new boolean[upperBound + 1];
        for (int i = 2; i <= upperBound; i++) {
            isPrime[i] = true;
        }

        // Now Finding Non - Prime Numbers
        for (int i = 2; (i * i) <= upperBound; i++) {
            if (isPrime[i]) {
                for (int j = (i * i); j <= upperBound; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Printing the Prime Numbers Within A Range Specified !

            System.out.println("The prime numbers in the range are : ");
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime[i]) {
                    System.out.println(i);
                }
        }
    }
}