import java.util.Scanner;
public class p19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        int sp=0;
        for (int i=0;i<n/2;i++){
             for(int j=n/2;j>i;j--){
                System.out.print("*");
            }
              for(int k=0;k<sp;k++){
                System.out.print("+");
                
            }
                for(int l=n/2;l>i;l--){
                System.out.print("*");  
                }
             System.out.println();
             sp+=2;
         
        }
        System.out.println(sp);
        for(int m=0;m<n/2;m++){
            for(int j=0;j<=m;j++){
                System.out.print("*");
            }
            for(int k=sp;k>2;k--){
                System.out.print("+");
                
            }
            for(int l=0;l<=m;l++){
                System.out.print("*");  
                }
             System.out.println();
             sp-=2;
        }
    }
    
}
