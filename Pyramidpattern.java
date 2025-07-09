import java.util.Scanner;

public class Pyramidpattern {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i, j;
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            
            System.out.println();
        }
    }
}
