package hu.sg.quicktip.entity.algorithm;

import hu.sg.quicktip.entity.Board;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public abstract class Algorithm implements Lottery{

    protected Random rand = new Random();

    protected Integer boardSize;
    protected Integer numberOfBoards;
    protected Integer setOfNumbers;

    protected Board generateBoard(){
        Board board = new Board();
        for (int j = 0; j < boardSize; j++) {
            board.getNumbers().add(rand.nextInt(setOfNumbers) + 1);
        }
        return board;
    }

}
