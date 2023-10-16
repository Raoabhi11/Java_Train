import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit");
        int dig=sc.nextInt();
        int a=0;
       int b=1;
        System.out.println(a);
        System.out.println(b);
        int sum=0;
        for(int i=1;i<=dig;i++){
            sum=sum+1;
            System.out.println(sum);
           }
        }
}
