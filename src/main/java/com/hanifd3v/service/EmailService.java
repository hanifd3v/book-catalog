package com.hanifd3v.service;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class EmailService {

    private final Session session;

    public EmailService(Session session) {
        super();
        this.session = session;
    }

    public void sendEmail(String destinationAddress, String mailSubject, String messageContext) throws Exception {
        System.out.println("Email Sent Successfully");
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("from@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinationAddress));
        message.setSubject(mailSubject);
        String body = messageContext;

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(body, "text/html; charset=utf-8");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        Transport.send(message);
    }
}
