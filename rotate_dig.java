import java.util.Scanner;

public class rotate_dig {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter thr Digit: ");
        int n=sc.nextInt();
        System.out.println("Enter no of rotote: ");
        int r=sc.nextInt();
        int count=0;
        int copy=0;
        while(r>0){
            rot = n%10;
            n=n/10;
            res= (rot*10000+n);
        }
        System.out.println(res);
    }
}
