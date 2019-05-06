package hu.sg.quicktip.entity;

import hu.sg.quicktip.validaiton.FirstAlgorithmValidationGroup;
import hu.sg.quicktip.validaiton.SecondAlgorithmValidationGroup;
import hu.sg.quicktip.validaiton.ThirdAlgorithmValidationGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Getter
@Setter
@XmlRootElement(name = "quicktipParameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class QuickTip implements Serializable {

    @NotNull(message = "Number of boards cannot be null!",
            groups = {
                    SecondAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @Min(value = 1, message = "Number of boards must be at least 1",
            groups = {
                    SecondAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @XmlElement(name = "numberOfBoards", nillable = true)
    private Integer numberOfBoards;

    @NotNull(message = "Algorithm cannot be null!",
            groups = {
                    FirstAlgorithmValidationGroup.class,
                    SecondAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @Min(value = 1, message = "Algorithm must be at least 1",
            groups = {
                    FirstAlgorithmValidationGroup.class,
                    SecondAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @Max(value = 3, message = "Algorithm must be lower than or equal to 3",
            groups = {
                    FirstAlgorithmValidationGroup.class,
                    SecondAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @XmlElement(name = "algorithm", required = true)
    private Integer algorithm;

    @NotNull(message = "Set of numbers cannot be null!",
            groups = {
                    FirstAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @Min(value = 1, message = "Set of numbers must be at least 1",
            groups = {
                    FirstAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @XmlElement(name = "setOfNumbers", nillable = true)
    private Integer setOfNumbers;

    @NotNull(message = "Board size cannot be null!",
            groups = {
                    FirstAlgorithmValidationGroup.class,
                    SecondAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @Min(value = 1, message = "Board size must be at least 1",
            groups = {
                    FirstAlgorithmValidationGroup.class,
                    SecondAlgorithmValidationGroup.class,
                    ThirdAlgorithmValidationGroup.class
            })
    @XmlElement(name = "boardSize", required = true, nillable = false)
    private Integer boardSize;

    @Override
    public String toString() {
        return "QuickTip{" +
                "numberOfBoards=" + numberOfBoards +
                ", algorithm=" + algorithm +
                ", setOfNumbers=" + setOfNumbers +
                ", boardSize=" + boardSize +
                '}';
    }
}
