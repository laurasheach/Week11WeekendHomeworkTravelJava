import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private FlightNoType flightNo;
    private DestinationType destination;
    private DepartureType departureAirport;
    private String departureTime;

    public Flight(PlaneType plane, FlightNoType flightNo, DestinationType destination, DepartureType  departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public int getPassengerNumbers(){
        return this.passengers.size();
    }

    public PlaneType getPlaneType(){
        return this.plane;
    }

    public FlightNoType getFlightNo(){
        return this.flightNo;
    }

    public DestinationType getFlightDestination(){
        return this.destination;
    }

    public DepartureType getDepartureAirport(){
        return this.departureAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public void addPassengerToFlight(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int getNoOfSeats(){
        return this.plane.getCapacity();
    }

    public int getNoOfAvailableSeats(){
        int bookedSeats = getPassengerNumbers();
        int totalSeats = getNoOfSeats();
        return totalSeats - bookedSeats;

    }

    public void bookPassengerIfSeatsAvailable(Passenger passenger){
        int availableSeats = getNoOfAvailableSeats();
        if(availableSeats > 0){
            addPassengerToFlight(passenger);
        }
    }


}
