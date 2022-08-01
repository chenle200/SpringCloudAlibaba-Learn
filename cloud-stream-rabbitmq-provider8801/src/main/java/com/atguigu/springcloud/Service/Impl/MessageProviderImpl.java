package com.atguigu.springcloud.Service.Impl;

import com.atguigu.springcloud.Service.IMessageProvider;
import org.bouncycastle.util.test.FixedSecureRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

@EnableBinding(Source.class) //可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {
    @Autowired
    private MessageChannel output;  //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        // 创建并发送消息
        this.output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***serial: " + serial);

        return serial;
    }
}
