package Core;
//Alle i gruppen har kodet denne klasse i fællesskab

import Diverse.Menu;
import Konkurrence.Konkurrencestyring;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();
        menu.runMenu();
    }
}
