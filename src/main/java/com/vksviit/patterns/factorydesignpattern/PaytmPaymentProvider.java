package com.vksviit.patterns.factorydesignpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(PaytmPaymentProvider.BEAN_ID)
@Slf4j
public class PaytmPaymentProvider implements PaymentProvider{

    public  static final String BEAN_ID = "paytmPaymentProvider";

    @Override
    public void acceptPayment() {
        log.info("Accepting Payment using Paytm");
    }
}
