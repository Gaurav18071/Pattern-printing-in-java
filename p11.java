import java.util.Scanner;
 public class p11{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("enetr the height :");
        int h= s.nextInt();
        int f=1;
        for(int i=1;i<=h;i++){
            if(i%2==0){
              f=0;
            }
            else{
                f=1;
            }
            System.out.print(f);
            for(int j=1;j<i;j++){
                f=1-f;
                System.out.print(f);
            }
            System.out.println();   
        }
    }
 }