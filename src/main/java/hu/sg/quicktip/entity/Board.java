package hu.sg.quicktip.entity;

import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Getter
@XmlRootElement(name = "Board")
@XmlAccessorType(XmlAccessType.FIELD)
public class Board {

    private List<Integer> numbers;

    public Board() {
        this.numbers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Board{" +
                "numbers=" + numbers +
                '}';
    }
}
