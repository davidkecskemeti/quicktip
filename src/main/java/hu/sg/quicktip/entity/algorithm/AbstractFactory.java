package hu.sg.quicktip.entity.algorithm;

import hu.sg.quicktip.entity.QuickTip;
import hu.sg.quicktip.entity.algorithm.Lottery;

public abstract class AbstractFactory {
    abstract public Lottery getTip(QuickTip parameter) throws Exception;
}