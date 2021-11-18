import java.util.*;

public class Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value of column");
        int c = sc.nextInt();
        System.out.println("enter value of row");
        int r = sc.nextInt();

        // outer loop --> for column
        for (int i = 1; i <= c; i++) {

            // inner loop --> for row
            for (int j = 1; j <= r; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

}
