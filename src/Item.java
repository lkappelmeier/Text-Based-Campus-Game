import java.util.ArrayList;

public class Item {
    public String itemName;
    public String use;
    public ArrayList<Item> listOfItems;
    //public Player player;
    public Item(String itemName, String use){
        this.itemName = itemName;
        this.use = use;
    }
    

    public String getItemName() {
        return itemName;
    }
    public String getUse() {
        return use;
    }
    public void addItem(ArrayList<Item> listOfItems, Item item){
        System.out.println("You have added a " + item.getItemName() + "!");
        listOfItems.add(item);
    
    }
    public void removeItem(ArrayList<Item> listOfItems, Item item){
        System.out.println("You have removed the " + item.getItemName());
        listOfItems.remove(item);
    }

    public Boolean checkForItem(ArrayList<Item> listOfItems, Item item){
        for (Item i : listOfItems) {
            if (i.getItemName()==item.getItemName()) {
                return true;
            }
        }
        return false;
    }

    
  
    public void useItem(Player player){
        if (getUse()=="sports") {
            System.out.println("You threw the " + getItemName() + "!");
            int t = player.getFitness();
            t++;
            player.setFitness(t);
            System.out.println("You now have " + player.getFitness() + " fitness points!");
        }
        if (getUse()=="creativity") {
            int t = player.getCreativity();
            t++;
            player.setCreativity(t);
            System.out.println("You now have " + player.getCreativity() + " creativity points!");
        }

    }


   



}
