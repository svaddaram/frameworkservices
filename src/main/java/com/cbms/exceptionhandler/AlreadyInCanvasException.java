package com.cbms.exceptionhandler;


public class AlreadyInCanvasException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public AlreadyInCanvasException() {
    	super();
    }
 
    public AlreadyInCanvasException(String message) {
        super(message);
    }
}