import java.util.Scanner;
public class Dateable {
     public static void main (String[] args){
         Scanner scanner = new Scanner (System.in);
         System.out.println("Enter Your Age");
         int age = scanner.nextInt();
         int date = age/2;
         int dateage = date+7;
         System.out.println("Your dating range is "+dateage+" and up");
     }
    }

