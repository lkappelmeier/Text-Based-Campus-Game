import java.util.ArrayList;
public class Player {
    private int charisma;
    private int logic;
    private int fitness;
    private int creativity;
    private double money;
    private ArrayList<Item> inventory;
    public int xPlayer;
    public int yPlayer;
    public int startX;
    public int startY;
    public String currentLocation;
    public Place currentLocationPlace;
    public Player(){
        this.charisma = 0;
        this.logic = 0;
        this.fitness = 0;
        this.creativity = 0;
        this.money = 0.0;
        this.xPlayer = 9;
        this.yPlayer = 11;
        this.inventory = new ArrayList<>();
    }
    public int getCharisma() {
        return charisma;
    }
    public int getCreativity() {
        return creativity;
    }
    public int getFitness() {
        return fitness;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }
    public int getLogic() {
        return logic;
    }
    public double getMoney() {
        return money;
    }
    public int getxPlayer() {
        return xPlayer;
    }
    public int getyPlayer() {
        return yPlayer;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setCreativity(int creativity){
        this.creativity = creativity;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }
    public void setLogic(int logic) {
        this.logic = logic;
    }

    public double setMoney(double money){
        this.money = money;
        return money;
    }
    public double addMoney(double amount){
        this.money = money + amount;
        return money;
    }


  


    public int setxPlayer(int x) {
        this.xPlayer = x;
        return xPlayer;
    }
    public int setyPlayer(int y) {
        this.yPlayer = y;
        return yPlayer;
    }
    public void setCoordinates(int xInput, int yInput){
        this.xPlayer = xInput;
        this.yPlayer = yInput;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    public void setCurrentLocationPlace(Place currentLocationPlace) {
        this.currentLocationPlace = currentLocationPlace;
    }
    public int getTotalPoints(){
        int totalPoints = getCharisma() + getCreativity() + getFitness() + getLogic();
        //System.out.println("You have " + totalPoints + " total points!");
        return totalPoints;
    }
    
    public void printAllPoints(){
        System.out.println("Charisma: " + getCharisma());
        System.out.println("Fitness: " + getFitness());
        System.out.println("Creativity: " + getCreativity());
        System.out.println("Logic: " + getLogic());
        System.out.println("Total Points: " + getTotalPoints());
    }

    public String getStringCurrentLocation(CampusMap campusMap, int x, int y, Place[] places) {
        this.currentLocation = campusMap.getStringPlaceFromCoordinates(x, y, places);
        return currentLocation;
    }
    public Place getCurrentLocationPlace(CampusMap campusMap, int x, int y, Place[] places) {
        this.currentLocationPlace = campusMap.getPlaceFromCoordinates(x, y, places);
        return currentLocationPlace;
    }
    //take
     public void pickUpItem(Item itemName){
        ArrayList<Item> inventory = new ArrayList<>();
        inventory.add(itemName);
    }

    public void checkForWin(Place[] places, CampusMap campusMap){
        if (getTotalPoints()==25|getCharisma()==10|getCreativity()==10|getFitness()==10|getLogic()==10) {
            System.out.println("You have earned enough points and have won the game!");
            printAllPoints();
        }
        if (getStringCurrentLocation(campusMap, getxPlayer(), getyPlayer(), places).equals("PVTA")) {
            System.out.println("You have made it to the B43 and can now flee to Amherst! You won!");
            printAllPoints();
        }

    }


     //Winning the Game
            // if (mainPlayer.getTotalPoints()==25||mainPlayer.getCharisma()==10||mainPlayer.getCreativity()==10||mainPlayer.getFitness()==10||mainPlayer.getLogic()==10) {
            //     System.out.println("You win!");
            //     mainPlayer.printAllPoints();
            //     sc.close();
            //     gameActive = false;
            // } else {
            // }
            // if (campusMap.getPlaceFromCoordinates(x, y, places)==null) {
            //     System.out.println("Location is null");
            // } else {
            //}

}
