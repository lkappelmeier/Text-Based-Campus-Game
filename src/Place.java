public class Place {
private String name;
private int xCoordinate;
private int yCoordinate;
private Boolean containsChest;
private Boolean restricted;


public Place(String name, int xCoordinate, int yCoordinate, Boolean containsChest){
    this.name = name;
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.containsChest = containsChest;
}

public Boolean getContainsChest() {
    return containsChest;
}
public String getName() {
    return name;
}
public int getxCoordinate() {
    return xCoordinate;
}
public int getyCoordinate() {
    return yCoordinate;
}
public Boolean getRestricted() {
    return restricted;
}




}

