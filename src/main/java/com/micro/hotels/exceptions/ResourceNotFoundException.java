package com.micro.hotels.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(){
        super();
    }
    public ResourceNotFoundException(String s) {
        super(s);
    }
}
