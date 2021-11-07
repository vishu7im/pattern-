import java.util.*;

public class solidRactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value of colum");
        int c = sc.nextInt();
        System.out.println("enter value of row");
        int r = sc.nextInt();

        // outer loop
        for (int i = 1; i <= r; i++) {

            // inner loop
            for (int j = 1; j <= c; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

}
