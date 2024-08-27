package com.kienjd.exception;

import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorResponse {

    private Date timestamp;
    private int status;
    private String path;
    private String error;
    private String message;

}