import java.util.Scanner;

public class Charsort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char ch1=sc.next().charAt(0);

        int a= (int)ch;
        int b= (int)ch1;

        if(a>b)
            System.out.println(ch1+" "+ch);
       else
            System.out.println(ch+" "+ch1);
        
        sc.close(); 
       
    }
    
}
