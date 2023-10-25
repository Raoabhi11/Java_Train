import java.util.Scanner;

public class rectangle {
    public static void parim(int l, int b){
        int x=2*(l+b);
        System.out.println("PARIMETER: "+ x);
    }
     public static void area(int l, int b){
        int x=l*b;
        System.out.println("PARIMETER: "+ x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b=sc.nextInt();
        System.out.println("1: PARIMETER: ");
        System.out.println("2: AREA: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            parim(l,b);
            break;
            case 2:
            area(l,b);
            break;
        }
    }
}
