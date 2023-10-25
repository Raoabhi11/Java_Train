import java.util.Scanner;

public class CelsiusToFar {
    public static void cels(int c){
        float x=c*(9/5)+32;
        System.out.println("Fahrenhiet: " + x);
    }
     public static void fahr(int f){
        float x=(f-32)*(5/9);
        System.out.println("Celsius: " + x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1: Celsius to Fahrenhiet");
        System.out.println("2: Fahrenhiet to Celsius");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
            System.out.println("Enter celsius: ");
            int c=sc.nextInt();
            cels(c);
            break;
            }
            case 2:{
            System.out.println("Enter fahrenhiet: ");
            int f=sc.nextInt();
            fahr(f);
            break;
            }
        }
    }
}

