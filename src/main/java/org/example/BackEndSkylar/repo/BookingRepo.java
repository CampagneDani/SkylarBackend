package org.example.BackEndSkylar.repo;

import org.example.BackEndSkylar.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BookingRepo extends JpaRepository<Booking, Long> {

    void deleteBookingById(Long id);

    Optional<Booking> findBookingById(Long id);
}
