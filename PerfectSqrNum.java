import java.util.*;
import static java.lang.Math.sqrt;

public class PerfectSqrNum {
    public static void perfectsqr(int n){
        int temp=(int)Math.sqrt(n);
        int temp2=temp*temp;
        if(temp2==n){
            System.out.println("PERFECT SQURE NUMBER: ");
        }
        else{
            System.out.println("NOT PERFECT SQURE: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number for check perfect squre: ");
        int n=sc.nextInt();
        perfectsqr(n);
    }
}
