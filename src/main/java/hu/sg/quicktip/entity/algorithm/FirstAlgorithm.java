package hu.sg.quicktip.entity.algorithm;

import hu.sg.quicktip.entity.Board;

import java.util.Arrays;
import java.util.List;

public class FirstAlgorithm extends Algorithm implements Lottery {

    /**
     * §  bemenő paraméterei (XML file-ból vegye)
     * <p>
     * ·         Az a számhalmaz, amiből véletlenszámokat generál
     * <p>
     * o   pl ha a parameter értéke “90”, az azt jelenti, hogy 1 és 90 között legyenek a véletlenszámok
     * <p>
     * ·         Véletlenszámok darabszáma
     * <p>
     * o   Pl ha a parameter értéke “5”, akkor 5 darab véletlenszámot generál a megadott intervallumban
     *
     * @param boardSize
     * @param setOfNumbers
     */
    public FirstAlgorithm(Integer boardSize, Integer setOfNumbers) {
        this.numberOfBoards = 1;
        this.boardSize = boardSize;
        this.setOfNumbers = setOfNumbers;

    }

    /**
     * §  Visszaadott érték
     * <p>
     * ·         1 darab játékpanel megfelelően kitöltve
     * <p>
     * o   A fenti példa alapján 5 véletlen szám az 1-90 intervallumból
     */
    @Override
    public List<Board> generate() {
        return Arrays.asList(generateBoard());
    }


}
