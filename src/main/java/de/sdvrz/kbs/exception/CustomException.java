package de.sdvrz.kbs.exception;

public class CustomException extends  Exception {
    public CustomException(String message, String name){
        super(message);
        System.out.printf("Nachricht: Problem liegt an  %s,  Author: %s", message, name);
    }
}
