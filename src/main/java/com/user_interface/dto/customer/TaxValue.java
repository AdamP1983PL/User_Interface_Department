package com.user_interface.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaxValue {
    ZERO(0), TWENTY_THREE(23);

    private final int value;

}
