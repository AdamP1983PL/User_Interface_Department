package com.user_interface.dto.vehicle;

import lombok.Getter;

@Getter
public enum GearboxType {
    UNKNOWN("UNKNOWN"),
    MANUAL("MANUAL"),
    SEMI_AUTOMATIC("SEMI_AUTOMATIC"),
    AUTOMATIC("AUTOMATIC");

    private final String displayText;

    GearboxType(String displayText) {
        this.displayText = displayText;
    }
}