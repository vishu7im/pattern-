import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your row no ");
        int a = sc.nextInt();

        // outer loop
        for (int i = 1; i <= a; i++) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // inner loop for space
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print(" ");
            }

            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }

        // outer loop
        for (int i = a; i >= 1; i--) {
            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // inner loop for space
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print(" ");
            }

            // inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }

    }

}
