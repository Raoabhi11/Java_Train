import java.util.Scanner;

public class PerfectNum {
    public static void check(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("Perfect number: ");
        }
        else{
            System.out.println("Not perfect number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number for check");
        int n=sc.nextInt();
        check(n);
    }
}
