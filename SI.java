import java.util.Scanner;

public class SI {
    public static int sipint(int p, int r, int t ) {
    int x=p*r*t;
    return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle value: ");
        int p=sc.nextInt();
        System.out.println("Enter the rate: ");
        int r=sc.nextInt();
        System.out.println("Enter the time: ");
        int t=sc.nextInt();
        int si=sipint(p,r,t);
        System.out.println("SIMPLE INTEREST: " + si);
        }
}
