import java.util.Scanner;

public class Monthcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int month = sc.nextInt(); 
        String monthCode;

        switch (month) {
            case 1:
                monthCode = "JANUARY";
                break;
            case 2:
                monthCode = "FEBRUARY";
                break;
            case 3:
                monthCode = "MARCH";
                break;
            case 4:
                monthCode = "APRIL";
                break;
            case 5:
                monthCode = "MAY";
                break;
            case 6:
                monthCode = "JUNE";
                break;
            case 7:
                monthCode = "JULY";
                break;
            case 8:
                monthCode = "AUGUST";
                break;
            case 9:
                monthCode = "SEPTEMBER";
                break;
            case 10:
                monthCode = "OCTOBER";
                break;
            case 11:
                monthCode = "NOVEMBER";
                break;
            case 12:
                monthCode = "DECEMBER";
                break;
            default:
                monthCode = "Invalid Month";
        }

        System.out.println("Output: "+monthCode);
    }
}
