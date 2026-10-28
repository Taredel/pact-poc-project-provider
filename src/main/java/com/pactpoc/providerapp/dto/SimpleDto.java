package com.pactpoc.providerapp.dto;

public class SimpleDto {

    private String simpleInteger;
    private MessageDto warningMessage;

    public SimpleDto(String simpleInteger, MessageDto message) {
        this.simpleInteger = simpleInteger;
        this.warningMessage = message;
    }

    public String getSimpleInteger() {
        return simpleInteger;
    }

    public MessageDto getWarningMessage() {
        return warningMessage;
    }
}
