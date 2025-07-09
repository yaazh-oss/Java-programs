import java.util.Scanner;

class Palindrome {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int rev=0;
       int temp=n;

       while(n>0){
          int d=n%10;
           rev=rev*10+d;
           n=n/10;
       }
       if(temp==rev){
           System.out.println("palindrome");
       }
       else
      {
           System.out.println("not a palindrome");
       }
       }
   }
