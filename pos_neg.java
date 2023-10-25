import java.util.Scanner;

public class pos_neg {
    public static void comp(int a){
        if(a>0)
        System.out.println("Positive: ");
        else{
            System.out.println("Negative: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        comp(a);
    }
}
