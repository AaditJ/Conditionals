// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//
//        int num1, num2, num3;
//
//        System.out.println("Please give me a number");
//        num1 = Integer.valueOf(s.nextLine());
//
//        System.out.println("Please give me another number");
//        num2 = Integer.valueOf(s.nextLine());
//
//        if (num1>num2) System.out.println(num1); else System.out.println(num2);
//
//        System.out.println("Please give me another number");
//        num3 = Integer.valueOf(s.nextLine());
//
//        if (num3%2 ==0) System.out.println("True"); else System.out.println("False");
//
//        String colour;
//        System.out.println("Please give me a traffic light colour");
//        colour = s.nextLine();
//
//        if (colour.equals("Red")) System.out.println("Stop");
//        else if (colour.equals("Yellow")) System.out.println("Wait");
//        else if (colour.equals("Green")) System.out.println("Go");

        System.out.println("Please give a month as a number");
        int month = Integer.valueOf(s.nextLine());

        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("This month is in the winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This month is in Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This month is in Summmer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This month is in Autumn");
                break;
            default:
                System.out.println("That number is not valid");
                break;
        }


    }
}
