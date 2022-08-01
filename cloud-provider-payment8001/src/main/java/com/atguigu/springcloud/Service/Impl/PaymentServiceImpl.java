package com.atguigu.springcloud.Service.Impl;

import com.atguigu.springcloud.Dao.PaymentDao;
import com.atguigu.springcloud.Entity.Payment;
import com.atguigu.springcloud.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
