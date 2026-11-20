import java.util.Scanner;
public class p13 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enetr the height :");
        int h = s.nextInt();
        int sum=0;
         for(int i=1;i<=h;i++){
            for(int j=0;j<i;j++){
                  sum=sum+1;
                  System.out.print(sum);
                  System.out.print("-");
            }
               System.out.println();
         }
        }
    
    
}
