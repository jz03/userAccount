package com.jz.account.servlet;

import com.jz.account.dto.MailSenderInfo;
import com.jz.account.util.SimpleMailSender;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 发送邮件
 *
 * @author: 冀陆涛
 * @create: 2018-07-25 19:10
 **/
@WebServlet(name = "SendEmail")
public class SendEmail extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");

        //这个类主要是设置邮件
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("Ji_lutao@163.com");
        mailInfo.setPassword("jlt461700");//您的邮箱密码
        mailInfo.setFromAddress("Ji_lutao@163.com");
        mailInfo.setToAddress(request.getParameter("toAddress"));
        mailInfo.setSubject(request.getParameter("subject"));
        mailInfo.setContent(request.getParameter("content"));
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
        //发送文体格式
        if (sms.sendTextMail(mailInfo)) {
            request.getRequestDispatcher("/Email/sendSuccess.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/goods/failure.jsp").forward(request, response);
        }

    }
}
