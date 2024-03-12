package com.user_interface.dto.customer;


import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    /* todo DO I NEED VALIDATION HERE????????????????*/

    private Long id;
    @Size(min = 3, max = 100)
    @NotEmpty(message = "Customer name should not be empty.")
    private String customerName;
    @Size(min = 6, max = 30)
    @NotEmpty(message = "Tax number should not be empty.")
    private String taxNumber;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Country name should not be empty.")
    private String country;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "City name should not be empty.")
    private String city;
    @Size(min = 3, max = 20)
    @NotEmpty(message = "Postal code should not be empty.")
    private String postalCode;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Street should not be empty.")
    private String street;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Customer email should not be empty.")
    private String customerEmail;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Customer phone number should not be empty.")
    private String customerPhoneNumber;
    private String customerWebsite;
    @NotEmpty(message = "Select option.")
    private boolean isActive;
    @NotEmpty(message = "Select option.")
    private boolean paymentIsBlocked;
    @NotEmpty(message = "Select option.")
    private PaymentMethod paymentMethod;
    @NotEmpty(message = "Select option.")
    private TaxValue taxValue;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Contact person full name should not be empty.")
    private String contactPersonName;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Customer person email should not be empty.")
    private String contactPersonEmail;
    @Size(min = 3, max = 30)
    @NotEmpty(message = "Customer person phone number should not be empty.")
    private String contactPersonPhone;

}


// todo add swagger documentation
