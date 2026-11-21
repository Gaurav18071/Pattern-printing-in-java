import java.util.Scanner;
public class p14 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("enetr the height :");
        int h = s.nextInt();
        
         for(int i=0; i<h;i++){
            for(char j=65; j<=65+i;j++){
               
                System.out.print(j);
            }
            System.out.println();
         }
    }
    
}
