import java.util.Scanner;

public class triangle {
    public static void tri(int a,int b, int c){
        if(a==b && b==c && c==a)
        System.out.println("Equilateral: ");
        else if(a==b || b==c || c==a)
        System.out.println("Isosceles: ");
        else {
            System.out.println("Scalene: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        tri(a,b,c);
    }
}
