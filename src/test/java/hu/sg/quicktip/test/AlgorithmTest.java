package hu.sg.quicktip.test;

import hu.sg.quicktip.entity.Board;
import hu.sg.quicktip.entity.QuickTip;
import hu.sg.quicktip.service.TicketService;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AlgorithmTest {

    @Test
    public void testFirstAlgorithm() {
        try {
            QuickTip quickTip = new QuickTip();
            quickTip.setAlgorithm(1);
            quickTip.setBoardSize(5);
            quickTip.setNumberOfBoards(5);
            quickTip.setSetOfNumbers(5);

            TicketService ticketService = new TicketService();
            List<Board> boards = ticketService.createByQuickTip(quickTip);
            ticketService.writeToConsole(boards);

            assertEquals(boards.size(), 1);
            assertEquals(boards.get(0).getNumbers().size(), 5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSecondAlgorithm() {
        try {
            QuickTip quickTip = new QuickTip();
            quickTip.setAlgorithm(3);
            quickTip.setBoardSize(5);
            quickTip.setNumberOfBoards(5);
            quickTip.setSetOfNumbers(5);

            TicketService ticketService = new TicketService();
            List<Board> boards = ticketService.createByQuickTip(quickTip);
            ticketService.writeToConsole(boards);

            assertEquals(boards.size(), quickTip.getNumberOfBoards().intValue());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testThirdAlgorithm() {
        try {
            QuickTip quickTip = new QuickTip();
            quickTip.setAlgorithm(3);
            quickTip.setBoardSize(5);
            quickTip.setNumberOfBoards(5);
            quickTip.setSetOfNumbers(5);

            TicketService ticketService = new TicketService();
            List<Board> boards = ticketService.createByQuickTip(quickTip);
            ticketService.writeToConsole(boards);

            assertEquals(boards.size(), quickTip.getNumberOfBoards().intValue());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
