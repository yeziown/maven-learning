package com.yezimvn.accountemail.service;

import com.yezimvn.accountemail.exception.AccountEmailException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Kui.Li likui@23mofang.com
 * @since 2018/2/4 0004
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountEmailServiceTests {
    @Autowired
    private AccounrEmailService accounrEmailService;
    private String to = "likui@23mofang.com";
    private String subject = "testSubject";
    private String content = "testContent";

    @Test
    public void sendEmailTest() throws AccountEmailException {
        accounrEmailService.sendMail(to, subject, content);
    }
}
