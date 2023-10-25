import java.util.Scanner;

public class tax {
    public static float salary(float n){
      if(n<=10000){
        return n;
    } 
    else if(n>10000 && n<=20000){
        float x=(n-(n*10/(100)));
        return x;
    }  
    else if(n>20000 && n<=30000){
        float x=(n -(n*15/(100)));
        return x;
    }  
    else{
       float x= (n -(n*25/(100))); 
        return x;
    }  
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the salary");
    float n=sc.nextInt();
    float a=salary(n);
    System.out.println("SALARY"+ a);
    }
    
}
