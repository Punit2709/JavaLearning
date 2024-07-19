package Practical;
import java.util.Scanner;

public class SumCalculator {
    
    // Function to calculate sum using a loop
    public static int sumUsingLoop(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
    
    // Function to calculate sum using an equation
    public static int sumUsingEquation(int N) {
        return (N * (N + 1)) / 2;
    }
    
    // Function to calculate sum using recursion
    public static int sumUsingRecursion(int N) {
        if (N == 0) {
            return 0;
        } else {
            return N + sumUsingRecursion(N - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a value for N: ");
        int N = scanner.nextInt();
        
        // Calculate sum using a loop
        long startTime = System.nanoTime();
        int sum1 = sumUsingLoop(N);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        System.out.println("Sum using loop: " + sum1);
        System.out.println("Time taken: " + elapsedTime + " nanoseconds");
        
        // Calculate sum using an equation
        startTime = System.nanoTime();
        int sum2 = sumUsingEquation(N);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        
        System.out.println("Sum using equation: " + sum2);
        System.out.println("Time taken: " + elapsedTime + " nanoseconds");
        
        // Calculate sum using recursion
        startTime = System.nanoTime();
        int sum3 = sumUsingRecursion(N);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        
        System.out.println("Sum using recursion: " + sum3);
        System.out.println("Time taken: " + elapsedTime + " nanoseconds");
        
        scanner.close();
    }
}
