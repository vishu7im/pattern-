import java.util.*;

public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number of column index");
        int c = sc.nextInt();
        int num = 1;

        // outer loop --> column
        for (int i = 1; i <= c; i++) {
            // inner loop --> row
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;

            }
            System.out.println(" ");

        }

    }

}
