import java.util.Scanner;

public class CountVowel {
    public static void count(String n){
        int count=0;
        for(int i=1;i<=n.length();i++){
            char c = n.charAt(i);
            if(c=='A' || c=='a' || c=='E' || c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='U' || c=='u'){
                count=count+1;
            }
        }
        System.out.println("Vowels: "+ count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String");
        String n=sc.nextLine();
        count(n);
    }
}
