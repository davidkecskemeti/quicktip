package hu.sg.quicktip.dao;

import hu.sg.quicktip.entity.QuickTip;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class QuickTipDao implements QuickTipInterface<QuickTip, String> {

    public QuickTipDao() {
    }

    public QuickTip read(String fileName) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(QuickTip.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        QuickTip entity = (QuickTip) jaxbUnmarshaller.unmarshal(new File(fileName));

        return entity;
    }
}