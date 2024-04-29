package se.campusmolndal.ecodemomo.service;

import org.springframework.stereotype.Service;
import se.campusmolndal.ecodemomo.model.Receipt;
import se.campusmolndal.ecodemomo.repository.ReceiptRepository;

@Service
public class ReceiptService {

    private final ReceiptRepository receiptRepository;

    public ReceiptService(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    public Receipt save(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    public Receipt saveReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    // other methods
}