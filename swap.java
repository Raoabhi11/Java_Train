import java.util.*;

public class swap {
    public static void Swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("AFTER SWAP:" + a);
        System.out.println("AFTER SWAP:" + b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        Swap(a,b);
    }
}