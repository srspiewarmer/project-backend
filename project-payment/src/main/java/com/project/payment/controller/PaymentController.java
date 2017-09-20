package com.project.payment.controller;

import com.project.payment.entity.Payment;
import com.project.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public void createPayment(@RequestBody Payment payment) {
        paymentService.submitPayment(payment);
    }

}
