import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number prime");
        int numbers = scanner.nextInt();
        int countPrime = 0;
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (countPrime < numbers) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countPrime += 1;
                }
                count = 0;
            }
        }
    }
}