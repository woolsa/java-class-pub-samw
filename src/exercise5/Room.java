package exercise5;

/**
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author woolsa01
 */
public class Room {
    private final String building;
    private final int number;
    
public Room(String building, int number) {
    this.building = building;
    this.number = number;
}

public String getBuilding() {
    return building;
}

public int getNumber() {
    return number;
}

    @Override
    public String toString() {
    return String.format("%s %d", building, number);
}

}