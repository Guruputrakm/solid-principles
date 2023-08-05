package com.solidprinciple.singleresponsibility.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Address {

    private String street;

    private String pin;

    private String city;

    private String country;
}
