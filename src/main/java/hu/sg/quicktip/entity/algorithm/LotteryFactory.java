package hu.sg.quicktip.entity.algorithm;

import hu.sg.quicktip.entity.QuickTip;
import hu.sg.quicktip.validaiton.FirstAlgorithmValidationGroup;
import hu.sg.quicktip.validaiton.SecondAlgorithmValidationGroup;
import hu.sg.quicktip.validaiton.ThirdAlgorithmValidationGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class LotteryFactory extends AbstractFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(LotteryFactory.class);

    @Override
    public Lottery getTip(QuickTip quickTip) throws Exception {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<QuickTip>> violations;

        switch (quickTip.getAlgorithm()) {
            case 1:
                violations = validator.validate(quickTip, FirstAlgorithmValidationGroup.class);
                break;
            case 2:
                violations = validator.validate(quickTip, SecondAlgorithmValidationGroup.class);
                break;
            case 3:
                violations = validator.validate(quickTip, ThirdAlgorithmValidationGroup.class);
                break;
            default:
                return null;
        }
        if (!violations.isEmpty()) {
            violations.forEach(violation -> LOGGER.error(violation.getMessage()));
            throw new Exception("Algorithm is not valid");
        } else {
            switch (quickTip.getAlgorithm()) {
                case 1:
                    return new FirstAlgorithm(quickTip.getBoardSize(), quickTip.getSetOfNumbers());
                case 2:
                    return new SecondAlgorithm(quickTip.getNumberOfBoards(), quickTip.getBoardSize());
                case 3:
                    return new ThirdAlgorithm(quickTip.getNumberOfBoards(), quickTip.getSetOfNumbers(), quickTip.getBoardSize());
            }
            return null;
        }
    }

}