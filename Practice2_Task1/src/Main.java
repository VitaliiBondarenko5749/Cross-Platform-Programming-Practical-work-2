import java.lang.*;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");

        double a = scanner.nextDouble();

        System.out.print("b: ");

        double b = scanner.nextDouble();

        double aRadian = Math.toRadians(a), bRadian = Math.toRadians(b);

        System.out.println("SIN a: " + Math.sin(aRadian) + " COS a: " + Math.cos(aRadian));
        System.out.println("SIN b: " + Math.sin(bRadian) + " COS b: " + Math.cos(bRadian));
    }
}
