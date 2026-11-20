import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enetr the height :");
        int h = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= h; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            for (int k = 0; k < (2 * h) - (2 * i); k++) {
                System.out.print("-");
            }
            for (int l = i; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

}
