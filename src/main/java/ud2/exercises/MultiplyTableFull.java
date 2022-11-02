package ud2.exercises;

import java.util.Scanner;
import java.util.Locale;

public class MultiplyTableFull {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = 5; j <= n; j++) {
                System.out.printf(" %3d", i*j);
            }
            System.out.println();
        }
    }
}