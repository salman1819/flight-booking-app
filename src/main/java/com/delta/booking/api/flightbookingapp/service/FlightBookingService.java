package com.delta.booking.api.flightbookingapp.service;

import com.delta.booking.api.flightbookingapp.domain.dto.BookingConfirmationDto;
import com.delta.booking.api.flightbookingapp.domain.entity.BookingOrder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {

    public BookingConfirmationDto bookFlight(BookingOrder bookingOrder) {
        return new BookingConfirmationDto(UUID.randomUUID(),
                "dhupra03@gmail.com",
                "Prashanth",
                "Dhulipalla",
                UUID.randomUUID(),
                "DAL101",
                "confirmed",
                "Domestic-North",
                45);
    }
}
