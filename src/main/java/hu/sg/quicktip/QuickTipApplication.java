package hu.sg.quicktip;

import hu.sg.quicktip.entity.*;
import hu.sg.quicktip.entity.Board;
import hu.sg.quicktip.service.QuickTipService;
import hu.sg.quicktip.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBException;
import java.util.List;

public class QuickTipApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuickTipApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Application started");

        try {
            QuickTipService quickTipService = new QuickTipService();
            QuickTip quickTip = quickTipService.readXml("quicktip.xml");

            try {
                TicketService ticketService = new TicketService();
                List<Board> boards = ticketService.createByQuickTip(quickTip);
                ticketService.writeToConsole(boards);
            } catch (Exception e) {
                LOGGER.error("Failed to generate the ticket!", e);
            }

        } catch (JAXBException e) {
            LOGGER.error("Failed to read xml!", e);
        }

    }
}
