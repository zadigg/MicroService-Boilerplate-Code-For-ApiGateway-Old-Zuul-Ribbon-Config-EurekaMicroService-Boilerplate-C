package com.example.accountservicewitheureka;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Account {
    private String accountNumber;
    private String balance;
}
