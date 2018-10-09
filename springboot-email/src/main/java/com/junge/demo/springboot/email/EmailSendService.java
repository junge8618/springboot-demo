package com.junge.demo.springboot.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

/**
 * 邮件发送测试
 *
 * @author liuxj
 * @create 2018-10-09 22:33
 */
@Component
public class EmailSendService {

    @Autowired
    private MailSender javaMailSender;

    public void sendSimpleEmail() {
        // 构造Email消息
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("junge8618@163.com");
        message.setTo("513851613@qq.com");
        message.setSubject("邮件主题");
        message.setText("邮件内容");
        javaMailSender.send(message);
    }
}
