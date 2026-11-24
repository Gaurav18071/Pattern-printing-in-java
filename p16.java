import java.util.Scanner;
public class p16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        char v=65;
        for (int i = 1; i <= n; i++) {
            for (int j=1; j <=i; j++) {
                
                System.out.print(v );
            }
            System.out.println();
            v++;
        }
    }
}
