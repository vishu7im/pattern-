import java.util.*;

public class Solid_Rohmbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your row");
        int a = sc.nextInt();

        // outer loop
        for (int i = 1; i <= a; i++) {

            // inner loop for space
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            // inner loop for star
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }

}
