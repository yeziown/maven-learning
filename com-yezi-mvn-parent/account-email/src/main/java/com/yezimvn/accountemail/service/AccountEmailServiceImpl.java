package com.yezimvn.accountemail.service;

import com.yezimvn.accountemail.exception.AccountEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author Kui.Li likui@23mofang.com
 * @since 2018/2/4 0004
 */
@Service
public class AccountEmailServiceImpl implements AccounrEmailService {
    private JavaMailSender javaMailSender;
    private String systenEmail;

    @Override
    public void sendMail(String to, String subject, String content) throws AccountEmailException {

        try {
            MimeMessage msg = javaMailSender.createMimeMessage();
            MimeMessageHelper msgHelper = new MimeMessageHelper(msg);
            msgHelper.setFrom(systenEmail);
            msgHelper.setTo(to);
            msgHelper.setSubject(subject);
            msgHelper.setText(content, true);
            javaMailSender.send(msg);
        } catch (MessagingException e) {
            throw new AccountEmailException("Failure to send mail.*", e);
        }
    }

    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String getSystenEmail() {
        return systenEmail;
    }

    public void setSystenEmail(String systenEmail) {
        this.systenEmail = systenEmail;
    }
}
