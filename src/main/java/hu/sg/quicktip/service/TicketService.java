package hu.sg.quicktip.service;

import hu.sg.quicktip.entity.*;
import hu.sg.quicktip.entity.Board;
import hu.sg.quicktip.entity.algorithm.AbstractFactory;
import hu.sg.quicktip.entity.algorithm.Lottery;
import hu.sg.quicktip.entity.algorithm.LotteryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TicketService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketService.class);

    public TicketService() {
    }

    public void writeToConsole(List<Board> boards) {
        LOGGER.info("Generated ticket");
        boards.forEach(board -> LOGGER.info(board.toString()));
    }

    public List<Board> createByQuickTip(QuickTip quickTip) throws Exception {
        AbstractFactory factory = new LotteryFactory();
        Lottery entity = factory.getTip(quickTip);
        return entity.generate();
    }
}