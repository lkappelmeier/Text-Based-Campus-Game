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


    public int addX(){
        this.xPlayer = xPlayer+1;
        return xPlayer;
    }
    public int moveNorth(){
        this.xPlayer--;
        System.out.println("Your new coordinates are X: " + xPlayer + " Y: " + yPlayer);
        return getxPlayer();
    }
    public int moveSouth(){
        this.xPlayer++;
        return getxPlayer();
    }
    public int moveWest(){
        this.yPlayer--;
        return yPlayer;
    }
    public int moveEast(){
        this.yPlayer++;
        return yPlayer;
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



     //take
     public void pickUpItem(Item itemName){
        ArrayList<Item> inventory = new ArrayList<>();
        inventory.add(itemName);
    }

}
