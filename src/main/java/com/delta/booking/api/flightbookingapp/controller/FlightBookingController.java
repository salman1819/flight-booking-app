package com.delta.booking.api.flightbookingapp.controller;

import com.delta.booking.api.flightbookingapp.domain.dto.BookingConfirmationDto;
import com.delta.booking.api.flightbookingapp.domain.entity.BookingOrder;
import com.delta.booking.api.flightbookingapp.service.FlightBookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/flight/")
public class FlightBookingController {
    private static Logger log = LoggerFactory.getLogger(FlightBookingController.class);

    private final FlightBookingService flightBookingService;

    @Autowired
    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

//    @Autowired
//    private final MapperConfig mapper;

    @PostMapping("/book-flight")
    public ResponseEntity<BookingConfirmationDto> bookFlight(@RequestBody BookingOrder bookingOrder) {
        if(bookingOrder == null) {
            return new ResponseEntity<BookingConfirmationDto>(HttpStatus.BAD_REQUEST);
        }
//        BookingOrderDto bookingOrderDto = convertToDto(bookingOrder);
        return new ResponseEntity<>(flightBookingService.bookFlight(bookingOrder), HttpStatus.CREATED);
    }

//    private BookingOrderDto convertToDto(BookingOrder bookingOrder) {
//        BookingOrderDto bookingOrderDto = modelMapper.map(bookingOrder, BookingOrderDto.class);
//        bookingOrderDto.setSubmissionDate(post.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
//        return bookingOrderDto;
//    }
}
