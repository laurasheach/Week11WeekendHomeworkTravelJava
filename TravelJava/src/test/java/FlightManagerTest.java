import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
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
        flightManager = new FlightManager();
        flight = new Flight(PlaneType.AIRBUSA380, FlightNoType.BA123, DestinationType.SFO, DepartureType.GLA, date);
        passenger1 = new Passenger("Laura", 1);
        passenger2 = new Passenger("Hazel", 1);
        passenger3 = new Passenger("Bob", 1);
        passenger4 = new Passenger("Alice", 1);
        passenger5 = new Passenger("Anne", 1);
        passenger6 = new Passenger("Alastair", 1);

    }

    @Test
    public void canGetWeightAvailableForLuggage(){
        assertEquals(250, flightManager.getWeightReservedForLuggage());
    }

    @Test
    public void canGetLuggageWeightOfPassengersOnFlight(){
        flight.bookPassengerIfSeatsAvailable(passenger1);
        flight.bookPassengerIfSeatsAvailable(passenger2);
        flight.bookPassengerIfSeatsAvailable(passenger3);
        assertEquals(150, flightManager.getWeightOfLuggageOnFlight(flight));
    }

    @Test
    public void canGetRemaingWeightAvailable(){
        flight.bookPassengerIfSeatsAvailable(passenger1);
        flight.bookPassengerIfSeatsAvailable(passenger2);
        flight.bookPassengerIfSeatsAvailable(passenger3);
        assertEquals(100, flightManager.getRemaingWeightAvailable(flight));
    }

}
