import java.util.Scanner;

public class mulTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Number :");
            int n = sc.nextInt();
            int i = 10;
            while(i>=1){
                System.out.println(n+" * "+i+" = "+n*i);
                i--;
            }
        }
    }
}
