package hu.sg.quicktip.dao;

import java.io.Serializable;

public interface QuickTipInterface<T,F extends Serializable> {
 
    T read(F fileName) throws Exception;
     
}