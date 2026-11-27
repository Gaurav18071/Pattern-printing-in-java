import java.util.Scanner;
public class p18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
             char a=(char)(65+n-1);
            for(int j=0;j<i;j++){
                
                System.out.print(a);
                a--;
            
            }
            System.out.println();
        }
    }

    
}
