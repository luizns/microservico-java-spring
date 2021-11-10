package com.luizns.hrpayroll.resources;

import com.luizns.hrpayroll.entities.Payment;
import com.luizns.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{wordId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long wordId, @PathVariable Integer days) {
        Payment payment = service.getPayment(wordId, days);
        return ResponseEntity.ok(payment);
    }
}
