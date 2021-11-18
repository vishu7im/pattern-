import java.util.*;

public class dimond_prymid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your column");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (int i = a; i >= 1; i--) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
