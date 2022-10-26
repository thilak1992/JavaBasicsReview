import java.util.*;
import java.util.Scanner;

public class ArrayComparision {
    public static void main(String[] args)
    {
        String[] strArray = {"Monday","Tuesday","Saturday","Sunday","Thursday","Friday","Wednesday" };
        boolean found = false;
        Scanner input = new Scanner(System.in);         //Create Scanner object
        System.out.println("Enter a day: \n Eg: Monday");
        String searchStr = input.nextLine();            //Read user input

        for (int i = 0; i <strArray.length; i++) {
            if(searchStr.equals(strArray[i])) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(searchStr +" found in the array ");
        else
            System.out.println(searchStr +" not found in the array");

    }


}