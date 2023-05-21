import java.util.Scanner;

public class mulSum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Value Of N :");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1;i<=10;i++){
                sum =  sum + (n * i);
            }
            System.out.println("Sum Of The Multiplicatives Of "+n+" Is : "+sum);
        }
    }
}
