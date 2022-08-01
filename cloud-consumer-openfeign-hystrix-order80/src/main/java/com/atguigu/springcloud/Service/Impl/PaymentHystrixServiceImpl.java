package com.atguigu.springcloud.Service.Impl;

import com.atguigu.springcloud.Service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "====PaymentHystrixService fall back paymentInfoOk，o(╥﹏╥)o====";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "====PaymentHystrixService fall back paymentInfoTimeOut，o(╥﹏╥)o====";
    }
}
