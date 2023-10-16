import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
