package hu.sg.quicktip.service;

import hu.sg.quicktip.dao.QuickTipDao;
import hu.sg.quicktip.entity.QuickTip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBException;

public class QuickTipService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuickTipService.class);
    private static QuickTipDao dao;

    public QuickTipService() {
        dao = new QuickTipDao();
    }

    public QuickTip readXml(String path) throws JAXBException {
        QuickTip quickTip = dao.read(path);
        LOGGER.info("Quicktip read: " + quickTip);
        return quickTip;
    }

    public static QuickTipDao getDao() {
        return dao;
    }
}
