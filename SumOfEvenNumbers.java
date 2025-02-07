import java.util.Scanner;

public class SumOfEvenNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();
        int k = n / 2;
        int sum = 2 * k * (k + 1) / 2;
        System.out.println("The sum of all even numbers up to " + n + " is: " + sum);
        scanner.close();
    }
}
