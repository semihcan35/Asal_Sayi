import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        int j;


        for( i=2; i<=100; i++) {
            int counter=0;

            for( j=1; j<=i; j++ ) {

                if (i%j == 0) {
                    counter++;

                }

            } if (counter <=2) {
                System.out.println(i);
            }
        }
    }
}
