package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer,Account and Loans information"
)
public class CustomerDetailsDto {

    @Schema(
            description = "Name of the customer", example = "Eazy Bytes"
    )
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Schema(
            description = "Email address of the customer", example = "tutor@eazybytes.com"
    )
    @NotEmpty(message = "Email should not be empty")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    AccountsDto accountsDto;

    @Schema(
            description = "Cards details of the Customer"
    )
    CardsDto cardsDto;

    @Schema(
            description = "Loans details of the Customer"
    )
    LoansDto loansDto;
}
