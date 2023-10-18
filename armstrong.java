package Functions;

import java.util.Scanner;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
public class armstrong{
    public static int arms(int n){
        int temp =n;
        int a=(int)log10(n)+1;
        
        int sum=0;
        while(n>0){
            sum=(int)(sum+pow((n%10),a));
            n=n/10;

        }
        if(sum==temp)
        return 0;
        else
        return 1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int x=arms(n);
            if(x==0)
               System.out.println("ARMSTRONG NUMBER: ");
            if(x==1)
               System.out.println("NOT A ARMSTRONG: ");
        }    

    }
}