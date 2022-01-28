import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
            if(n%4 == 0) {
                sum = sum + n;
            }

        }while (n%2 == 0);
        System.out.println(sum);
    }
}
