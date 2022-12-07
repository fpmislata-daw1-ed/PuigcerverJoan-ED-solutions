package ud3.exams;

import java.util.Scanner;
import java.util.Locale;

public class DebugPokerGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        boolean escala = true;
        int comptadorCartesIguals = 1;
        int anterior = -1;

        for (int i = 0; i < 3; i++) {
            int carta = in.nextInt();

            if(anterior == carta)
                comptadorCartesIguals++;
            else if(anterior != -1 && anterior != carta + 1)
                escala = false;

            anterior = carta;
        }

        if(comptadorCartesIguals == 3)
            System.out.println("Trio");
        else if (comptadorCartesIguals == 2)
            System.out.println("Parella");
        else if (escala)
            System.out.println("Escala");
        else
            System.out.println("Carta alta");

    }
}