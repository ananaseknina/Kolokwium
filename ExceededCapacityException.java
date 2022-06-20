package com.company;

public class ExceededCapacityException extends Exception{
    public ExceededCapacityException(String errorMessage) {
        super(errorMessage);
    }
}
