package com.yezimvn.accountemail.service;

import com.yezimvn.accountemail.exception.AccountEmailException;

/**
 * @author Kui.Li likui@23mofang.com
 * @since 2018/2/4 0004
 */
public interface AccounrEmailService {
    void sendMail(String to, String subject, String content) throws AccountEmailException;
}
