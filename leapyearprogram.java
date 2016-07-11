
/**
 * Created by alexona on 7/11/16.
 */
import java.util.Scanner;

class LeapYear
{
    public static void main(String [] args)
    {
        int year;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter year that you would like to find out if is a leap year or not");
        year= input.nextInt();
        boolean leapyear= (year%4==0);
        System.out.println("leapyear="+leapyear);
    }
}

