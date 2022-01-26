package com.delta.booking.api.flightbookingapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BookingOrderDto {
    private final String originLocationCode;
    private final String destinationLocationCode;
    private final LocalDate departureDate;
    private final LocalDate returnDate;
    private final String tripType;
    private final int numOfPassengers;
    private final String email;
    private final String firstName;
    private final String lastName;
}
