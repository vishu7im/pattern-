import java.util.*;

public class Rotated_Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. ");
        int c = sc.nextInt();

        // outerloop --> for row
        for (int i = c; i >= 0; i--) {
            // iner loop 1 --> for colum
            for (int j = 1; j <= (c - i); j++) {
                System.out.print(" ");

            }
            // inner loop 2 --> for colum
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
