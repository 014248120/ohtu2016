package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.ui.UI;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        UI ui = new UI(scanner);
        ui.kaynnista();
    }
}
