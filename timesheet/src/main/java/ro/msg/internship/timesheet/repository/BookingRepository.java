package ro.msg.internship.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.msg.internship.timesheet.model.Booking;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
    List<Booking> findBookingByDay(LocalDate day);
    
    List<Booking> findBookingByUserId(Integer userId);
}
