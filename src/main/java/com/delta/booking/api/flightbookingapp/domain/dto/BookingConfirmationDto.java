package com.delta.booking.api.flightbookingapp.domain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class BookingConfirmationDto {
    private final UUID reservationId;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final UUID confirmationNumber;
    private final String flightNumber;
    private final String status;
    private final String departureTerminal;
    private final int departureGate;

}
