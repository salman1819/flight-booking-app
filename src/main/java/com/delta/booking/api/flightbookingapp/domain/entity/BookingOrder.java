package com.delta.booking.api.flightbookingapp.domain.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

//@Entity
//@Table
@Data
//@NoArgsConstructor
@RequiredArgsConstructor
public class BookingOrder {
    private final String originLocationCode;
    private final String destinationLocationCode;
    private final LocalDate departureDate;
    private final LocalDate returnDate;
    private final String tripType;
    private final int numOfPassengers;
}
