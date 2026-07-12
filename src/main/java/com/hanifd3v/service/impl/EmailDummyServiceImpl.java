package com.hanifd3v.service.impl;

import com.hanifd3v.service.EmailService;

public class EmailDummyServiceImpl implements EmailService {
    @Override
    public void sendEmail(String destinationAddress, String subject, String body) {
        System.out.println("destination address = " + destinationAddress);
        System.out.println("mail subject = " + subject);
        System.out.println("message content = " + body);

    }
}
