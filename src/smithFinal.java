//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class smithFinal {
public int x;



    public static void main(String[] args) {
        Boolean gameActive = true;
          //Add Locations
          Place [] places = {
            new Place("Campus Center", 7, 12, true),
            new Place("Helen Hills Hills Chapel", 4, 11, false),
            new Place("Davis Center", 4, 14, true),
            new Place("Ainsworth Gym", 14, 7, false),
            new Place("John M. Greene", 7, 13, false),
            new Place("Dewey", 8, 13, false),
            new Place("Clark", 8, 14, false),
            new Place("Unity", 7, 16, false),
            new Place("Burton Lawn", 9, 11, false),            
            new Place("President's House", 4, 8, false),
            new Place("Friedman Complex", 4, 12, false),
            new Place("Admission's", 5, 9, false),
            new Place("Wilson", 1, 6, false),
            new Place("King", 1, 7, false),
            new Place("Morrow", 2, 5, false),
            new Place("Gardiner", 2, 7, false),
            new Place("Scales", 2, 8, true),
            new Place("Haynes", 3, 5, true),
            new Place("Cushing", 3, 6, false),
            new Place("Quad", 2, 6, false),
            new Place("Jordan", 3, 7, false),
            new Place("Road", 3, 8, false),
            new Place("Tenney & Friends", 3, 9, false), 
            new Place("Parsons annex", 3, 11, false),
            new Place ("Parsons", 3, 12, false),
            new Place("Capen Annex", 3, 14, false),
            new Place("Friedmans", 4, 4, false),
            new Place("Comstock", 4, 5, false),
            new Place("Emerson", 4, 6, false),
            new Place("Path", 4, 9, false),
            new Place("Park", 4, 10, false),
            new Place("Parking Lot", 4, 13, false),
            new Place("Capen Garden", 4, 14, false),
            new Place("Road", 5, 10, false), 
            new Place("Park Annex", 5, 11, false),
            new Place("Sessions", 5, 12, false),
            new Place("Ziskind", 5, 13, false),
            new Place("Cutter", 5, 14, false),
            new Place("Grass", 5, 15, false),
            new Place("Capen", 5, 16, false),
            new Place("Parking Lot", 6, 10, false),
            new Place("Haven/Wesley/Hopkins", 6, 11, true),
            new Place("Campus Center Cafe", 6, 12, false),
            new Place("Road", 6, 13, false),
            new Place("Road", 6, 14, false),
            new Place("Lamont", 6, 15, true),
            new Place("Talbot", 6, 16, false),
            new Place("Boat House", 7, 9, false),
            new Place("Lyman Conservatory", 7, 10, false),
            new Place("Chapin", 7, 11, true),
            new Place("PVTA", 7, 14, false),
            new Place("Northrop-Gillet", 7, 15, true),
            new Place("Hungry Ghost Bread", 7, 17, false),
            new Place("Crew House", 8, 9, false), 
            new Place("Path", 8, 10, false),
            new Place("Wright", 8, 11, false), 
            new Place("Chapin Lawn", 8, 12, true),
            new Place("Chase-Duckett", 8, 15, false),
            new Place("Albright", 8, 16, false), 
            new Place("Baldwin", 8, 17, false),
            new Place("Pond", 9, 8, false),
            new Place("Sabin-Reed", 9, 9, true),
            new Place("Burton", 9, 10, true)

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

        while (gameActive) {
      
        
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
        if (userInput.contains("coordinates")) {
            System.out.println("You are located at X: " + mainPlayer.xPlayer + " Y: " + mainPlayer.yPlayer);
        }

        //Movement
        if (userInput.contains("move")) {
            if (userInput.contains("north")) {
                mainPlayer.xPlayer--;
                if (campusMap.getPlaceFromCoordinates(mainPlayer.xPlayer, mainPlayer.yPlayer, places)==null) {
                    System.out.println("You cannot go here!");
                    mainPlayer.xPlayer++;
                }

            }
            if (userInput.contains("west")) {
                mainPlayer.yPlayer--;
                if (campusMap.getPlaceFromCoordinates(mainPlayer.xPlayer, mainPlayer.yPlayer, places)==null) {
                    System.out.println("You cannot go here!");
                    mainPlayer.yPlayer++;
                }
            }
            if (userInput.contains("south")) {
                mainPlayer.xPlayer++;
                if (campusMap.getPlaceFromCoordinates(mainPlayer.xPlayer, mainPlayer.yPlayer, places)==null) {
                    System.out.println("You cannot go here!");
                    mainPlayer.xPlayer--;
                }
            }
            if (userInput.contains("east")) {
                mainPlayer.yPlayer++;
                if (campusMap.getPlaceFromCoordinates(mainPlayer.xPlayer, mainPlayer.yPlayer, places)==null) {
                    System.out.println("You cannot go here!");
                    mainPlayer.yPlayer--;
                }
            }
        }
        
        // Movement


    }

        }




    }



