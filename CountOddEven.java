import java.util.Scanner;

public class CountOddEven {
    public static void count( int n){
       int cout1=0;
       int cout2=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                cout1=cout1+1;  
            }
            else{
                cout2=cout2+1;
            }
        }
         System.out.println("Even number: "+ cout1);
        System.out.println("Odd number: "+ cout2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        count(n);
    }
}
