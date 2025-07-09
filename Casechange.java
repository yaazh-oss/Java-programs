import java.util.Scanner;

public class Casechange {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    char c=sc.next().charAt(0);

    if(c>'A' && c<='Z'){
        System.out.print("Output: "+(char)(c+32));
    }
    else if(c>='a' && c<='z'){
        System.out.print("Output: "+(char)(c-32));
    }
    

    }
}