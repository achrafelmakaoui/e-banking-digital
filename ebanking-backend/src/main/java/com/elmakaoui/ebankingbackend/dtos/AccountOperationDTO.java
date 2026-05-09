package com.elmakaoui.ebankingbackend.dtos;

import com.elmakaoui.ebankingbackend.entities.BankAccount;
import com.elmakaoui.ebankingbackend.enums.OperationType;
import lombok.Data;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
