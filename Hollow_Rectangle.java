import java.util.*;

public class hollowrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your colume ");
        int c = sc.nextInt();
        System.out.println("enter your row");
        int r = sc.nextInt();

        // outer loop
        for (int i = 1; i <= r; i++) {

            // inner loop
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || j == c || i == r) {
                    System.out.print("*");

                } else {
                    System.out.print("");

                }
            }
            System.out.println();

        }

    }

}
