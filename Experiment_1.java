import java.util.Scanner;
public class Experiment_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n=s.nextInt();
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i=2;i<=n;i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}