package com.hanifd3v.service.impl;

import com.hanifd3v.service.AuthService;
import com.hanifd3v.service.EmailService;

public class AuthServiceImpl implements AuthService {

    private final EmailService emailService;

    public AuthServiceImpl(EmailService emailService) {
        super();
        this.emailService = emailService;
    }
    @Override
    public Boolean login(String email) throws Exception {
        emailService.sendEmail(email, "Your Otp", "12345");
        return null;
    }

    @Override
    public Boolean confirmOTP(String sessionId, String otp) {
        return null;
    }
}
