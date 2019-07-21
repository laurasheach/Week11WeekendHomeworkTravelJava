import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;
    Date date;

    @Before
    public void setup(){
        date = new Date();
        flight = new Flight(PlaneType.AIRBUSA380, FlightNoType.BA123, DestinationType.SFO, DepartureType.GLA, date);
        passenger = new Passenger("Laura", 1);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Laura", passenger.getPassengerName());
    }

    @Test
    public void canGetNoOfBags(){
        assertEquals(1, passenger.getNoOfBags());
    }

    @Test
    public void canGetNoOfFlights(){
        assertEquals(0, passenger.getNoOfFlights());
    }

    @Test
    public void canAddFlight(){
        passenger.addFlight(flight);
        assertEquals(1, passenger.getNoOfFlights());
    }

    @Test
    public void canAddFlightToListWhenBooked(){
        flight.bookPassengerIfSeatsAvailable(passenger);
        passenger.addFlightToListWhenBooked(flight);
        assertEquals(1, passenger.getNoOfFlights());
//        assertEquals(1, passenger.getSeatNumbers());
    }

    @Test
    public void canGetSeatNumbers(){
        assertEquals(0, passenger.getSeatNumbers());
    }


    @Test
    public void canAddSeat(){
        passenger.addFlight(flight);
        passenger.addFlightToListWhenBooked(flight);
        flight.addSeatsToFlight();
        flight.shuffle();
        passenger.addSeatNumbers(flight);
        assertEquals(1, passenger.getSeatNumbers());
    }

}
