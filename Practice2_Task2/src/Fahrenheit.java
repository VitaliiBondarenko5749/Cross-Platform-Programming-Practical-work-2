import java.io.*;
import java.util.Scanner;
public class Fahrenheit {
    public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input Temperature in Farinheight: ");

            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32)*5.0/9.0;

            System.out.println(fahrenheit +" by Farinheight");
            System.out.println(celsius + " by Celsius");
    }
}
