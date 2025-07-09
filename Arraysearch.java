import java.util.Scanner;

public class Arraysearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
       int c=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                c++;
                System.out.print(i);
                break;
            }
        }
        if(c==0){
            System.out.print("-1");
        }

        }
    
}
