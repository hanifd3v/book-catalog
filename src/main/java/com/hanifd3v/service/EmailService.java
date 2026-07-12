package com.hanifd3v.service;

public interface EmailService {

    public void sendEmail(String destinationAddress, String mailSubject, String messageContext) throws Exception;
}
