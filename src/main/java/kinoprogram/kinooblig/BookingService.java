

package kinoprogram.kinooblig;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public List<Booking> getAllBookingsSortedByLastName() {
        // Hent alle bestillinger fra databasen og sorter etter etternavn
        return bookingRepository.findAll(Sort.by(Sort.Direction.ASC, "etternavn"));
    }

    public void deleteAllBookings() {
        bookingRepository.deleteAll();
    }
}



/*
@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public List<Booking> getAllBookingsSortedByLastName() {
        // Hent alle bestillinger fra databasen
        List<Booking> bookings = bookingRepository.findAll();

        // Sorter bestillingene etter etternavn
        Collections.sort(bookings, new Comparator<Booking>() {
            @Override
            public int compare(Booking b1, Booking b2) {
                return b1.getEtternavn().compareTo(b2.getEtternavn());
            }
        });

        return bookings;
    }

    public void deleteAllBookings() {
        bookingRepository.deleteAll();
    }
}

/*

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public List<Booking> getAllBookingsSortedByLastName() {
        // Hent alle bestillinger fra databasen
        List<Booking> bookings = bookingRepository.findAll();

        // Sorter bestillingene etter etternavn
        Collections.sort(bookings, new Comparator<Booking>() {
            @Override
            public int compare(Booking b1, Booking b2) {
                return b1.getEtternavn().compareTo(b2.getEtternavn());
            }
        });

        return bookings;
    }
}





 */