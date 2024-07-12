package com.scaler.Splitwise.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

//@Getter
//@Setter
//@NoArgsConstructor // no-args / default constructor
//@AllArgsConstructor // parameterised constructor
@Data // Instead of getter, setter, noArgsConstructor, toString()
@AllArgsConstructor
public class TransactionDTO {
    private String fromUserName;
    private String toUserName;
    private double amount;
}
