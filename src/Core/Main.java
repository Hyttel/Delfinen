package Core;

import Diverse.Menu;
import Konkurrence.Konkurrencestyring;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();
        menu.runMenu();
        Konkurrencestyring g = new Konkurrencestyring();

        g.startKonkurrence();
    }
}
