package kinoprogram.kinooblig;

import kinoprogram.kinooblig.Booking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
public class BookingController {

    // her er arrayet flyttet til server 
    private List<Booking> bookings = new ArrayList<>();

    @PostMapping("/bookings")
    public void addBooking(@RequestBody Booking booking) {
        bookings.add(booking);
    }
   // @GetMapping("/bookings")
    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookings;
    }
}

