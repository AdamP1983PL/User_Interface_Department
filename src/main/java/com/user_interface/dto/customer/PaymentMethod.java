package com.user_interface.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.annotation.security.DenyAll;

@Getter
@AllArgsConstructor
public enum PaymentMethod {
    CASH("CASH"),
    THREE_DAY_TRANSFER("THREE_DAY_TRANSFER"),
    SEVEN_DAY_TRANSFER("SEVEN_DAY_TRANSFER"),
    FOURTEEN_DAY_TRANSFER("FOURTEEN_DAY_TRANSFER"),
    BY_CARD("BY_CARD"),
    CONFIRMED_TRANSFER("CONFIRMED_TRANSFER");

    private final String displayText;

}
