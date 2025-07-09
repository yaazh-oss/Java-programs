import java.util.Scanner;

public class Classification {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char c=sc.next().charAt(0);

    if(c>='A' && c<='Z' || c>='a' && c<='z') {
        System.out.println("Alphabet");
    } else if(c>='0' && c<='9') {
        System.out.println("Digit");
    } else {
        System.out.println("Special Character");
    }
    }
}
