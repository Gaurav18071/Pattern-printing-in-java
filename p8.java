import java.util.Scanner;
public class p8{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight if pyramind : ");
        int n = s.nextInt();

    for(int i=n-1;i>0;i--){
        for(int j=1;j<n-i;j++){
            System.out.print("-");
        }
         for(int j=1;j<2*i;j++){
            System.out.print("*");
         }
         for(int j=1;j<n-i;j++){
            System.out.print("-");
         }
         System.out.println();
    }
   
}
}