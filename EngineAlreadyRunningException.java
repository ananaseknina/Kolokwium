package com.company;

public class EngineAlreadyRunningException extends Exception {
    public EngineAlreadyRunningException(String errorMessage) {
        super(errorMessage);
    }
}
