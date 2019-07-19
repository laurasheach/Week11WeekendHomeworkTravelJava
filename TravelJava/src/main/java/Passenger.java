public class Passenger {

    private String name;
    private int luggage;

    public Passenger(String name, int luggage){
        this.name = name;
        this.luggage = luggage;
    }

    public String getPassengerName(){
        return this.name;
    }

    public int getNoOfBags(){
        return this.luggage;
    }

}
