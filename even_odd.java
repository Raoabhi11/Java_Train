import java.util.Scanner;

public class even_odd {
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter where to start");
    int start=sc.nextInt();
    System.out.println("Enter the range");
    int range=sc.nextInt();
    for(int i=start;i<=range;i++){
        if(i%2==0){
            System.out.println("EVEN: "+ i);
        }
        else{
            System.out.println("ODD: "+ i);
        }
       }
    }
}

