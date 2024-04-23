

package kinoprogram.kinooblig;
import kinoprogram.kinooblig.Booking;
import kinoprogram.kinooblig.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/bookings")
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookingService.getAllBookingsSortedByLastName();
    }

    @DeleteMapping("/bookings")
    public void deleteAllBookings() {
        bookingService.deleteAllBookings();
    }
}


