package org.kasource.di.bean;

/**
 * Exception thrown by BeanResolver if no bean can be resolved.
 * 
 * @author rikardwi
 */
public class BeanNotFoundException extends RuntimeException {
  
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param message Error message
     **/
    public BeanNotFoundException(String message) {
        super(message);
    }
    
    /**
     * Constructor.
     * 
     * @param message Error message
     * @param cause   Cause.
     **/
    public BeanNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
