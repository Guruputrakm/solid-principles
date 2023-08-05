package com.solidprinciple.singleresponsibility.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String accountName;
    private Long accountNumber;

    private Address address;

    private Double balance;
}
