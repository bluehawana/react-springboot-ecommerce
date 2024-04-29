package se.campusmolndal.ecodemomo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import se.campusmolndal.ecodemomo.model.Receipt;
import se.campusmolndal.ecodemomo.service.ReceiptService;

@RestController
@CrossOrigin(origins = "*") // Allow requests from all origins
public class ReceiptController {

    private final ReceiptService receiptService;


    @Autowired
    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @PostMapping("/receipts")
    public Receipt createReceipt(@RequestBody Receipt receipt) {
        return receiptService.saveReceipt(receipt);
    }

    // other methods
}