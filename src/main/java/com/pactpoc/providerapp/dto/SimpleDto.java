package com.pactpoc.providerapp.dto;

public class SimpleDto {

    private int simpleInteger;
    private MessageDto warningMessage;

    public SimpleDto(int simpleInteger, MessageDto message) {
        this.simpleInteger = simpleInteger;
        this.warningMessage = message;
    }

    public int getSimpleInteger() {
        return simpleInteger;
    }

    public MessageDto getWarningMessage() {
        return warningMessage;
    }
}
