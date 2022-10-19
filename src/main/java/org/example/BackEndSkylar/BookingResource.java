package org.example.BackEndSkylar;

import org.example.BackEndSkylar.model.Booking;
import org.example.BackEndSkylar.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/booking")
public class BookingResource {

    private final BookingService bookingService;

    public BookingResource(BookingService bookingService){
        this.bookingService = bookingService;
    }


    @GetMapping()
    public ResponseEntity<List<Booking>> getAllBookings(){
        List<Booking> bookings = bookingService.findAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id") Long id){
        Booking booking = bookingService.findBookingById(id);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
        Booking newBooking = bookingService.addBooking(booking);
        return new ResponseEntity<>(newBooking, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking){
        Booking updateBooking = bookingService.updateBooking(booking);
        return new ResponseEntity<>(updateBooking, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable("id") Long id){
        bookingService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
