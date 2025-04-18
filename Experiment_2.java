/*Write a Java program to find the Fibonacci series using recursive 
and non-recursive functions.*/
import java.util.Scanner;
public class Experiment_2 {
        //recursion
    public int fiboRecur(int n) {
        if (n<=1)
            return n;
        return fiboRecur(n-1)+fiboRecur(n-2);
    }
    public void fiboLoop(int n) {
        int a=0,b=1;
        System.out.print("Fibonacci series (Loop): ");
        for (int i=0;i<n;i++) {
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Experiment_2 ob=new Experiment_2();
        System.out.print("Enter number of terms: ");
        int n=s.nextInt();

        //Loop
        ob.fiboLoop(n);

        // Recursive
        System.out.print("Fibonacci series (Recursive): ");
        for(int i=0;i<n;i++) {
            System.out.print(ob.fiboRecur(i)+" ");
        }
    }
}
 