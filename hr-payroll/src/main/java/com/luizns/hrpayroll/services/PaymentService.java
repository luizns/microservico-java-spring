package com.luizns.hrpayroll.services;

import com.luizns.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Bod", 200.0, days);
    }
}
