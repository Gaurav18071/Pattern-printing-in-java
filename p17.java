import java.util.Scanner;
public class p17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=n-1;j>i;j--) {
                System.out.print("-");
            }
              for(char c=65;c<65+i+1;c++){
                System.out.print(c);
              }
               for( char k= (char)(65+i-1);k>=65;k-- ){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
