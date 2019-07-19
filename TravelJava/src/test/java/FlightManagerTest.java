import org.junit.Before;
import org.junit.Test;

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

    @Before
    public void setup(){

        flightManager = new FlightManager();
        flight = new Flight(PlaneType.AIRBUSA380, FlightNoType.BA123, DestinationType.SFO, DepartureType.GLA, "10:00AM");
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

}
