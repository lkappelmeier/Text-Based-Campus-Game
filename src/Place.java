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
public void setxCoordinate(int xCoordinate) {
    this.xCoordinate = xCoordinate;
}
public void setyCoordinate(int yCoordinate) {
    this.yCoordinate = yCoordinate;
}


public void setContainsChest(Boolean containsChest) {
    this.containsChest = containsChest;
}

public void lookForChest(Player player, CampusMap campusMap, Place[] places){
    Place tempLocation = player.getCurrentLocationPlace(campusMap, player.getxPlayer(), player.getyPlayer(), places);
    if (tempLocation.getContainsChest()) {
        System.out.println("You have found a chest!");
    }
}

public void lookForPeople(Player player, CampusMap campusMap, Person[] persons, Place[] places){
    Place tempLocation = player.getCurrentLocationPlace(campusMap, player.getxPlayer(), player.getyPlayer(), places);
    for (Person person : persons) {
         if (tempLocation==person.getPersonLocation()) {
            System.out.println("There is someone here!");
            break;
         }
    }
}



}

