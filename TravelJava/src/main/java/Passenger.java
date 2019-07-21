import java.util.ArrayList;
import java.util.Random;

public class Passenger {

    private String name;
    private int luggage;
    private ArrayList<Flight> flights;
    private ArrayList<Integer> seatNumbers;
//    private Random random;

    public Passenger(String name, int luggage){
        this.name = name;
        this.luggage = luggage;
        this.flights = new ArrayList<Flight>();
        this.seatNumbers = new ArrayList<Integer>();
//        this.random = new Random();
    }

    public String getPassengerName(){
        return this.name;
    }

    public int getNoOfBags(){
        return this.luggage;
    }

    public int getNoOfFlights(){
        return this.flights.size();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void addFlightToListWhenBooked(Flight flight){
        if(flight.getPassengerNumbers() > 0){
            addFlight(flight);
//            addSeatNumbers();
        }
    }

    public int getSeatNumbers(){
        return this.seatNumbers.size();
    }

    public void addSeatNumbers(Flight flight){
       int seat = flight.removeSeatWhenBooked();
       this.seatNumbers.add(seat);
    }


//    public void addSeatNumbers(){
//        int seat = random.nextInt(6);
//        this.seatNumbers.add(seat);
//    }

//    public void addSeatNumbers(int seat){
//        this.seatNumbers.add(seat);
//    }


}
