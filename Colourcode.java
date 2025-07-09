import java.util.Scanner;

public class Colourcode {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    char c=sc.next().charAt(0);

    switch (c) 
        {
            case 'R':
            case 'r':
                System.out.print("Output: Red");
                break;
            case 'G':
            case 'g':
                System.out.print("Output: Green");
                break;
            case 'B':
            case 'b':
                System.out.print("Output: Blue");
                break;
            case 'Y':
            case 'y':
                System.out.print("Output: Yellow");
                break;
            case 'O':
            case 'o':
                System.out.print("Output: Orange");
                break;
            case 'W':
            case 'w':
                System.out.print("Output: White");
                break;
            default:
                System.out.print("Output: Invalid Input");
        }
    

    }
}
