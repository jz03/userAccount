package com.jz.account.dto;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 发送邮件验证
 *
 * @author: 冀陆涛
 * @create: 2018-07-25 19:32
 **/
public class MyAuthenticator extends Authenticator {

    String userName = null;
    String password = null;

    public MyAuthenticator() {
    }

    public MyAuthenticator(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password);

    }
}
