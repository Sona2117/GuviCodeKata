import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number range: ");
        int input = s.nextInt();
        int input1 = s.nextInt();
        int count = 0;       
        for (int i = input; i < input1; i++) {
           boolean isPrimeNumber = true;
            for (int j = input; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; 
                }
            }
            if (isPrimeNumber) {
                count++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("Count: " + count);
    }

}
