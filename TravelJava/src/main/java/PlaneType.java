public enum PlaneType {

    BOEING747(400, 400),
    AIRBUSA380(5, 500),
    BOEING737(130, 150),
    AIRBUSA321(185, 90);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }



}
