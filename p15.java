import java.util.Scanner;
public class p15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        for (int i = n; i >0; i--) {
            for (char j = 65; j < 65+i; j++) {
                System.out.print(j );
            }
            System.out.println();
        }
    }
}
