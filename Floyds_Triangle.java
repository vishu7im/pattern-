import java.util.*;

public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number of row index");
        int c = sc.nextInt();
        int num = 1;

        // outer loop --> row
        for (int i = 1; i <= c; i++) {
            // inner loop --> colme
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;

            }
            System.out.println(" ");

        }

    }

}