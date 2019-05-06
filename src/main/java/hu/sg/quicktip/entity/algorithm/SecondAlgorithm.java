package hu.sg.quicktip.entity.algorithm;

import hu.sg.quicktip.entity.Board;

import java.util.ArrayList;
import java.util.List;

public class SecondAlgorithm extends Algorithm implements Lottery {

    /**
     * §  bemenő paraméterei (XML file-ból vegye)
     * <p>
     * ·         Panelszám
     * <p>
     * o   pl ha a parameter értéke “3”, az azt jelenti, hogy 3 darab kitöltött játékpanelt generál, 1 és 90 között legyenek a véletlenszámok (ebben az esetben az 1-90 tartomány fix, nem paraméterezhető)
     * <p>
     * ·         Véletlenszámok darabszáma
     * <p>
     * o   Pl ha a parameter értéke “5”, akkor 5 darab véletlenszámot generál a megadott intervallumban
     */

    public SecondAlgorithm(Integer numberOfBoards, Integer boardSize) {
        this.numberOfBoards = numberOfBoards;
        this.boardSize = boardSize;
        this.setOfNumbers = 90;
    }

    /**
     * §  Visszaadott érték
     * <p>
     * ·         N darab játékpanel megfelelően kitöltve
     * <p>
     * o   A fenti példa alapján 3 játékpanel, mindegyiken 5 véletlen szám az 1-90 intervallumból
     */


    @Override
    public List<Board> generate() {
        List<Board> boards = new ArrayList<>();
        for (int i = 0; i < numberOfBoards; i++) {
            boards.add(generateBoard());
        }
        return boards;
    }
}
