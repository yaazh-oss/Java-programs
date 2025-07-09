import java.util.Scanner;

class Arrayascii {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int[] arr=new int[n];

       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       for(int j=0;j<n;j++){
           System.out.print((char)arr[j]+" ");
       }

       }
}
