package src;

public class Courier extends Workers {
    private int capacity;//Вместительность
    public Courier(String name_worker, String year_born,int capacity) {
        super(name_worker, year_born);
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
}
