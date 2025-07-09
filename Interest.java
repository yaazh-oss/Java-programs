import java.util.Scanner;

public class Interest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String gender=sc.next();
        int age=sc.nextInt();

        if(gender.equalsIgnoreCase("Female") && (age>=1 && age<=58)){
            System.out.println("Interest is 8.2%");
        }   
        else if(gender.equalsIgnoreCase("Female") && (age>=59 && age<=100)){
            System.out.println("Interest is 9.2%");
        }   
        else if(gender.equalsIgnoreCase("Male") && (age>=1 && age<=58)){
            System.out.println("Interest is 8.4%");
        }   
        else if(gender.equalsIgnoreCase("Male") && (age>=59 && age<=100)){
            System.out.println("Interest is 10.5%");
        }   
    }
    
}
