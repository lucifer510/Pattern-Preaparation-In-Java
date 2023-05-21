import java.util.Scanner;

/**
 * evenSum
 */
public class evenSum {

    public static void main(String[] args) {
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Number :");
            int n = sc.nextInt();
            int i = 0;
            while(i<=n){
                if(i%2==0){
                    sum = sum + i;
                }
                i++;
            }
            System.out.println("Sum of Even Numbers :"+sum);
        }
    }
}