package edu.eci.cvds.samples.persistence;

public class PersistenceException extends Exception {
    public PersistenceException(String message,org.apache.ibatis.exceptions.PersistenceException e){
        super(message);
    }

    public PersistenceException(String s) {
        super(s);
    }
}
