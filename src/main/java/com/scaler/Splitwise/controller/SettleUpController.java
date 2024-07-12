package com.scaler.Splitwise.controller;

import com.scaler.Splitwise.dto.SettleUpResponseDTO;
import com.scaler.Splitwise.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SettleUpController {
    @GetMapping("/hello") // GET call -> localhost:8080/hello
    public ResponseEntity helloWorld() {
        TransactionDTO transactionDTO1 = new TransactionDTO("Anish", "Bhakti", 100);
        TransactionDTO transactionDTO2 = new TransactionDTO("Deepan", "Omkar", 100000);
        List<TransactionDTO> transactions = List.of(transactionDTO1, transactionDTO2);
        SettleUpResponseDTO settleUpResponseDTO = new SettleUpResponseDTO(transactions);
        return ResponseEntity.ok(settleUpResponseDTO);
    }
}

//GET PUT POST DELETE