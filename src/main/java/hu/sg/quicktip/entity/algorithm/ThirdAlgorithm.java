package hu.sg.quicktip.entity.algorithm;

import hu.sg.quicktip.entity.Board;

import java.util.ArrayList;
import java.util.List;

public class ThirdAlgorithm extends Algorithm implements Lottery {

    /**
     * §  bemenő paraméterei (XML file-ból vegye)
     * <p>
     * ·         Panelszám
     * <p>
     * o   pl ha a parameter értéke “3”, az azt jelenti, hogy 3 darab kitöltött játékpanelt generál
     * <p>
     * ·         Az a számhalmaz, amiből véletlenszámokat generál
     * <p>
     * o   pl ha a parameter értéke “90”, az azt jelenti, hogy 1 és 90 között legyenek a véletlenszámok
     * <p>
     * ·         Véletlenszámok darabszáma
     * <p>
     * o   Pl ha a parameter értéke “5”, akkor 5 darab véletlenszámot generál a megadott intervallumban
     */
    public ThirdAlgorithm(Integer numberOfBoards, Integer setOfNumbers, Integer boardSize) {
        this.numberOfBoards = numberOfBoards;
        this.setOfNumbers = setOfNumbers;
        this.boardSize = boardSize;
    }

    /**
     * §  Visszaadott érték
     * <p>
     * ·         N darab játékpanel megfelelően kitöltve
     * <p>
     * ·         A fenti példa alapján 3 játékpanel, mindegyiken 5 véletlen szám az 1-90 intervallumból
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
