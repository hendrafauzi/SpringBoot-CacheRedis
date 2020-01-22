package com.hendra.cache.controller;

import com.hendra.cache.model.PaymentAccount;
import com.hendra.cache.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController
{
    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    @Cacheable(value = "accountList", cacheManager = "cacheAccount")
    @GetMapping("/list")
    public List<PaymentAccount> getAccountList()
    {
        System.out.println("Payment Account List");
        return paymentService.getAccountList();
    }
}