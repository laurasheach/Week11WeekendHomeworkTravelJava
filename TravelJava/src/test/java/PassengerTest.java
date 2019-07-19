import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup(){
        passenger = new Passenger("Laura", 1);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Laura", passenger.getPassengerName());
    }

}
