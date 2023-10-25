import java.util.Scanner;

public class SumOfMultiOfNumInaRange {
    public static void sumof(int a, int n){
        int sum=0;
        for(int i=a;i<=n;i++){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum : "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=sc.nextInt();
        int n=sc.nextInt();
        sumof(a,n);
    }
}
