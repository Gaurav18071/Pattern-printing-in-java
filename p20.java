import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (n) - (2 * i); k++) {
                System.out.print("+");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int f = 1; f < n / 2; f++) {
            for (int m = f; m < n / 2; m++) {
                System.out.print("*");
            }
            for (int n1 = 1; n1 <= (2 * f); n1++) {
                System.out.print("+");
            }
            for (int o = f; o < n / 2; o++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}