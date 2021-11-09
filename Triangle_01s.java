import java.util.*;

public class Triangle_01s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. ");
        int c = sc.nextInt();

        // outer loop --> for row
        for (int i = 1; i <= c; i++) {

            // inner loop --> for colum
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");

                } else {
                    System.out.print("1");

                }

            }
            System.out.println("");

        }

    }

}
