//import java.lang.reflect.Array;
public class CampusMap {
    private Place[] places;
    // private int x;
    // private int y;
    //public Chest[] chests;

    public CampusMap(Place[] places){
        this.places = places;

    }

    public Place[] getPlaces() {
        System.out.println(places);
        return places;
    }

    public String getStringPlaceFromCoordinates(int x, int y, Place[] places){
        for (int i = 0; i < places.length; i++) {
            int tempX = places[i].getxCoordinate();
            int tempY = places[i].getyCoordinate();
                if (tempX == x && tempY ==y) {
                    System.out.println("You are at " + places[i].getName());
                    return places[i].getName();
                }
                if (i==places.length) {
                    System.out.println("nothing found");
                }
        } 
        return null;
    }


    public Place getPlaceFromCoordinates(int x, int y, Place[] places){
        for (int i = 0; i < places.length; i++) {
            int tempX = places[i].getxCoordinate();
            int tempY = places[i].getyCoordinate();
                if (tempX == x && tempY ==y) {
                    System.out.println("You are at " + places[i].getName());
                    return places[i];
                }
                if (i==places.length) {
                    System.out.println("nothing found");
                }
        } 
        return null;
    }
}
