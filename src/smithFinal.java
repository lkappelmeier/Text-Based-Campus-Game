//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class smithFinal {
public int x;



    public static void main(String[] args) {
        Boolean gameActive = true;
        while (gameActive) {
        //Add Locations
        Place [] places = {
            new Place("Campus Center", 7, 12, true, false),
            new Place("Helen Hills Hills Chapel", 4, 11, false, false),
            new Place("Davis Center", 4, 14, true, false),
            new Place("Ainsworth Gym", 14, 7, false, false),
            new Place("John M. Greene", 7, 13, false, false),
            new Place("Dewey", 8, 13, false, false),
            new Place("Clark", 8, 14, false, false),
            new Place("Unity", 7, 16, false, false),
            new Place("Burton", 9, 11, false, false),            
            new Place("President's House", 4, 8, false, false),
            new Place("FriedmanComplex", 4, 12, false, false),
            new Place("Admission", 5, 9, false, false)
        };

        //Campus Map
        CampusMap campusMap = new CampusMap(places);
        
        //Player
        Player mainPlayer = new Player();
       
        //Inventory & Chest
        ArrayList<Item> inventory = new ArrayList<>();
        ArrayList<Item> chest = new ArrayList<>();
            //Create Items
            Item basketball = new Item("basketball", "sports");
            Item money = new Item("money", "transactions");
            //Add Items
            chest.add(basketball);

        //Initalize Scanner
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().toLowerCase();
    
        //Game Loop
            if (userInput.contains("quit")) {
                System.out.println("Thanks for playing!");
                sc.close();
                gameActive = false;
            }

        // Taking Items
        if (userInput.contains("take")) {
            if (userInput.contains("basketball")) {
                if (basketball.checkForItem(chest, basketball)) {
                    basketball.addItem(inventory, basketball);
                    basketball.removeItem(chest, basketball);
                } else {
                    System.out.println("Uh there is no basketball in this chest... Awkward");
                }
               
            }
            if (userInput.contains("money")) {
                money.addItem(inventory, money);
                money.removeItem(chest, money);
                mainPlayer.addMoney(10.0);
            }
        }
            
        //Getting Locations
        

        
        }




    }



}