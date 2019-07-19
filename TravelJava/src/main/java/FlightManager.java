public class FlightManager {

    public static int getWeightReservedForLuggage(){
        int totalWeight = PlaneType.AIRBUSA380.getTotalWeight();
        int weightAvailable = totalWeight / 2;
        return weightAvailable;
    }

    

}
