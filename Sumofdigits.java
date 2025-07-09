import java.util.Scanner;

class Sumofdigits {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int sum=0;
       int length = String.valueOf(n).length();

       for(int i=length;i>0;i--){
           int d=n%10;
           sum+=d;
           n=n/10;
       }

       System.out.print(sum);
       s.close();
    }
}
