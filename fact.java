import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Number :");
            int n = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is :" + fact);
        }

    }
}
