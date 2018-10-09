package com.junge.demo.springboot.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 邮件发送接口
 *
 * @author liuxj
 * @create 2018-10-09 22:37
 */
@RestController
public class EmailSenderController {

    @Autowired
    private EmailSendService service;

    @GetMapping("/sendemail")
    public String sendEmail() {

        service.sendSimpleEmail();

        return "success";
    }
}
