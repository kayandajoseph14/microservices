package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String sourceName, String fieldName, String fieldValue)
    {
        super(String.format("%s not found with given input data %s:%s", sourceName, fieldName, fieldValue));
    }
}
