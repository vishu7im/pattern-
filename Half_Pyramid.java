import java.util.*;

public class halfpyrmid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. ");
        int c = sc.nextInt();

        // outer loop
        for (int i = 1; i <= c; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }

    }

}
