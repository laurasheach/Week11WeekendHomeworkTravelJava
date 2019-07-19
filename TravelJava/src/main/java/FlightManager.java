public class FlightManager {

    public static int getWeightReservedForLuggage(){
        int totalWeight = PlaneType.AIRBUSA380.getTotalWeight();
        int weightAvailable = totalWeight / 2;
        return weightAvailable;
    }

    public static int getWeightOfLuggageOnFlight(Flight flight){
        int totalPassengers = flight.getPassengerNumbers();
        int baggageAllowancePerPassenger = getWeightReservedForLuggage() / PlaneType.AIRBUSA380.getCapacity();
        return totalPassengers * baggageAllowancePerPassenger;
    }

    public static int getRemaingWeightAvailable(Flight flight){
        int weightOfLuggage = getWeightOfLuggageOnFlight(flight);
        int totalWeightAvailable = getWeightReservedForLuggage();
        return totalWeightAvailable - weightOfLuggage;

    }

}
