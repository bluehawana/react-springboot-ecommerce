package se.campusmolndal.ecodemomo.service;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    public PaymentService() {
        Stripe.apiKey = "your-stripe-secret-key";
    }

    public Charge charge(String token, int amount) throws StripeException {
        Map<String, Object> params = new HashMap<>();
        params.put("amount", amount);
        params.put("currency", "sek");
        params.put("source", token);
        return Charge.create(params);
    }
}