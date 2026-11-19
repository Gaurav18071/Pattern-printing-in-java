import java.util.Scanner;
 public class p10{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("enetr the height :");
        int h= s.nextInt();

    for(int i=0;i<h;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }

             for(int k=h-1;k>0;k--){
                for(int l=k;l>0;l--){
                System.out.print("*");
            }
              System.out.println();
        }

    }
 }
