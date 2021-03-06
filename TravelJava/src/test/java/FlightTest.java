import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Date date;

    @Before
    public void setup(){
        date = new Date();
        flight = new Flight(PlaneType.AIRBUSA380, FlightNoType.BA123, DestinationType.SFO, DepartureType.GLA, date);
        passenger1 = new Passenger("Laura", 1);
        passenger2 = new Passenger("Hazel", 1);
        passenger3 = new Passenger("Bob", 1);
        passenger4 = new Passenger("Alice", 1);
        passenger5 = new Passenger("Anne", 1);
        passenger6 = new Passenger("Alastair", 1);
    }

    @Test
    public void canCheckPassengersStartsAt0(){
        assertEquals(0, flight.getPassengerNumbers());
    }

    @Test
    public void canCheckPlaneType(){
        assertEquals(PlaneType.AIRBUSA380, flight.getPlaneType());
    }

    @Test
    public void canCheckFlightNo(){
        assertEquals(FlightNoType.BA123, flight.getFlightNo());
    }

    @Test
    public void canCheckDestination(){
        assertEquals(DestinationType.SFO, flight.getFlightDestination());
    }

    @Test
    public void canCheckDepartureAirport(){
        assertEquals(DepartureType.GLA, flight.getDepartureAirport());
    }

    @Test
    public void canCheckDepartureTime(){
        assertEquals(new Date(), flight.getDepartureTime());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(1, flight.getPassengerNumbers());
    }

    @Test
    public void canCheckNoOfSeats(){
        assertEquals(5, flight.getNoOfSeats());
    }

    @Test
    public void canCheckNoOfAvailableSeats(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        assertEquals(2, flight.getNoOfAvailableSeats());
    }

    @Test
    public void canBookPassengerIfSeatsAvailable(){
        flight.addPassengerToFlight(passenger1);
        flight.bookPassengerIfSeatsAvailable(passenger2);
        assertEquals(2, flight.getPassengerNumbers());
    }

    @Test
    public void cannotBookPassengerIfNoSeatsAvailable(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger4);
        flight.addPassengerToFlight(passenger5);
        flight.bookPassengerIfSeatsAvailable(passenger6);
        assertEquals(5, flight.getPassengerNumbers());
    }

    @Test
    public void canCheckSeatListStartsAt0(){
        assertEquals(0, flight.getSeatNumbers());
    }

    @Test
    public void canPopulateSeatArray(){
        flight.addSeatsToFlight();
        flight.shuffle();
        assertEquals(5, flight.getSeatNumbers());
    }

    @Test
    public void canRemoveSeatWhenBooked(){
        flight.bookPassengerIfSeatsAvailable(passenger1);
        flight.addSeatsToFlight();
        flight.shuffle();
        flight.removeSeatWhenBooked();
        assertEquals(4, flight.getSeatNumbers());
    }
}
