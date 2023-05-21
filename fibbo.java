import java.util.Scanner;

public class fibbo {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter Value Of N :");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Fibonacci Series : 0");
        }
        else if(n == 1){
            System.out.println("Fibonacci Series : 0 1");
        }
        else{
            System.out.print("Fibonacci Series : 0 1 ");
            int a = 0;
            int b = 1;
            int c = 0;
            for(int i = 2;i<=n;i++){
                c = a + b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
        }
    }
    }
}
