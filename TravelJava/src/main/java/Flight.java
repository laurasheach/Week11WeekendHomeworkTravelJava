import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private FlightNoType flightNo;
    private DestinationType destination;
    private DepartureType departureAirport;
    private Date departureTime;
    private ArrayList<Integer> seats;

    public Flight(PlaneType plane, FlightNoType flightNo, DestinationType destination, DepartureType departureAirport, Date departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = new Date();
        this.seats = new ArrayList<Integer>();

    }

    public int getPassengerNumbers() {
        return this.passengers.size();
    }

    public PlaneType getPlaneType() {
        return this.plane;
    }

    public FlightNoType getFlightNo() {
        return this.flightNo;
    }

    public DestinationType getFlightDestination() {
        return this.destination;
    }

    public DepartureType getDepartureAirport() {
        return this.departureAirport;
    }

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void addPassengerToFlight(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getNoOfSeats() {
        return this.plane.getCapacity();
    }

    public int getNoOfAvailableSeats() {
        int bookedSeats = getPassengerNumbers();
        int totalSeats = getNoOfSeats();
        return totalSeats - bookedSeats;

    }

    public void bookPassengerIfSeatsAvailable(Passenger passenger) {
        int availableSeats = getNoOfAvailableSeats();
        if (availableSeats > 0) {
            addPassengerToFlight(passenger);
        }
    }

    public int getSeatNumbers(){
        return this.seats.size();
    }

    public void addSeatsToFlight(){
        int seatNumber = 0;
        for(int i = 0; i < getNoOfSeats(); i++){
            seatNumber += 1;
            this.seats.add(seatNumber);
        }
    }

    public void shuffle(){
        Collections.shuffle(seats);
    }

    public int removeSeatWhenBooked(){
        int seat = this.seats.remove(0);
        return seat;
    }

}
