import java.util.*;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your column ");
        int c = sc.nextInt();
        System.out.println("enter your row");
        int r = sc.nextInt();

        // outer loop --> for column
        for (int i = 1; i <= c; i++) {

            // inner loop --> for row
            for (int j = 1; j <= r; j++) {
                if (i == 1 || j == 1 || j == c || i == r) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }

    }

}
