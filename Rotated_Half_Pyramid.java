import java.util.*;

public class rotatedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. ");
        int c = sc.nextInt();

        // outerloop
        for (int i = 1; i <= c; i++) {

            for (int j = 1; j <= (c - i); j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
