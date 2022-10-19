package org.example.BackEndSkylar.service;

import org.example.BackEndSkylar.exception.BookingNotFoundException;
import org.example.BackEndSkylar.model.Booking;
import org.example.BackEndSkylar.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BookingService {

    private final BookingRepo bookingRepo;


    @Autowired
    public BookingService(BookingRepo bookingRepo){
        this.bookingRepo = bookingRepo;
    }

    public Booking addBooking(Booking booking){
        return bookingRepo.save(booking);
    }

    public List<Booking> findAllBookings(){
        return bookingRepo.findAll();
    }

    public Booking findBookingById(Long id){
        return bookingRepo.findBookingById(id).orElseThrow(() -> new BookingNotFoundException("Booking by id "+ id + "was not found"));
    }

    public Booking updateBooking(Booking booking){
        return bookingRepo.save(booking);
    }

    public void deleteBooking(Long id){
        bookingRepo.deleteBookingById(id);
    }



}
