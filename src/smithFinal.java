//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class smithFinal {

    public static void main(String[] args) {
        System.out.println("Welcome to The Smith Scavenger Game!" );
        System.out.println("------------------------------------------------");
        System.out.println("You can look for chests of items and people to interact with to help you on your journey.");
        System.out.println("Don't fall in the pond, and make sure to check on your skill points!");
        System.out.println("You can use commands such as :");
        System.out.println("move (direction)");
        System.out.println("open chest");
        System.out.println("use (object)");
        System.out.println("interact");
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
            new Place("Burton", 9, 10, true),
            new Place("Compass Cafe", 9, 12, false),
            new Place("Path", 9, 13, false), 
            new Place("Museum of Art", 9, 14, false),
            new Place("Road", 9, 15, false),
            new Place("Alumnae House", 9, 16, false),
            new Place("Pond", 10, 8, false),
            new Place("Path", 10, 9, false),
            new Place("Tyler", 11,9, false ),
            new Place("Young Library", 11, 11, false),
            new Place("Alumnae Gym", 11, 12,false ),
            new Place("Washburn", 11, 13, false),
            new Place("Seelye", 11, 14, false),
            new Place("Pierce", 11, 15, false),
            new Place("College Hall", 11, 16, false),
            new Place("Field", 12, 6, false),
            new Place("Bridge", 12, 7, false),
            new Place("Sweeney", 12, 8, false),
            new Place("Path", 12, 9, false),
            new Place("Morris", 12, 10, false),
            new Place("Lawrence", 12, 11, false),
            new Place("Parking Lot", 12, 12, false),
            new Place("Hubbard", 12, 13, false),
            new Place("Lilly", 12, 14, false),
            new Place("Parking Lot", 13, 7, false),
            new Place("Sage", 13, 8, false),
            new Place("Mendenhall", 13, 9, false),
            new Place("Mendenhall", 13, 10, false),
            new Place("Ford", 13, 11, false),
            new Place("Parking Lot", 13, 12, false),
            new Place("Ainsworth Gym", 14, 7, false),
            new Place("Scott Gym", 14, 8, false),
            new Place("Josten", 14, 9, false),
            new Place("Schacht Center", 14, 10, false),
            new Place("Ford", 14, 11, false),
            new Place("Pond", 10, 8, false), 
            new Place("Conference Center", 10, 9, false),
            new Place("McConnell", 10, 10, false),
            new Place("Bass", 10, 11, false),
            new Place("Neilson", 10, 12, false),
            new Place("Neilson Lawn", 10, 13, false),
            new Place("Hillyer", 10, 14, false),
            new Place("Road", 10, 15, false),
            new Place("Stoddard", 10, 16, false)
        };

        //Campus Map
        CampusMap campusMap = new CampusMap(places);
        //Player
        Player mainPlayer = new Player();
       
        //Inventory & Chest
        ArrayList<Item> inventory = new ArrayList<>();
        ArrayList<Item> chest = new ArrayList<>();
            //Create Items
            Item basketball = new Item("basketball", "fitness");
            Item money = new Item("random book", "charisma");
            Item shoes = new Item("shoes", "clothing");
            Item hat = new Item("hat", "clothing");
            Item DVD = new Item("dvd", "entertainment");
            Item mathBook = new Item("math book", "logic");
            Item chessBoard = new Item("chess board", "logic");
            Item SWAGBook = new Item("swag textbook", "charisma");
            Item sabcarpCD = new Item("sabrina carpenter album", "creativity");
            Item paintbrushes = new Item("paintbrushes", "creativity"); 
            Item baseball = new Item("baseball", "fitness");
            Item violin = new Item("violin", "creativity");
            Item flute = new Item("flute", "creativity");
            Item sketchbook = new Item("sketchbook", "creativity");
            Item physicsBook = new Item("physics book", "logic");
            Item celsius = new Item("celsius energy drink", "energy");
            Item chickenTenders = new Item("chicken tenders", "food");
            Item frisbee = new Item("frisbee", "fitness");
            Item poetryBook = new Item("poetry book", "charisma");
            Item checkersBoard = new Item("checker's board", "logic");
            Item nyt = new Item("nyt games subscription", "logic");
            Item saxophone = new Item("saxophone", "creativity");
            //Add Items
            chest.add(basketball);
            chest.add(money);
            chest.add(shoes);
            chest.add(hat);
            chest.add(DVD);
            chest.add(mathBook);
            chest.add(chessBoard);
            chest.add(SWAGBook);
            chest.add(sabcarpCD);
            chest.add(paintbrushes);
            chest.add(baseball);
            chest.add(violin);
            chest.add(flute);
            chest.add(sketchbook);
            chest.add(physicsBook);
            chest.add(celsius);
            chest.add(chickenTenders);
            chest.add(frisbee);
            chest.add(poetryBook);
            chest.add(checkersBoard);
            chest.add(nyt);
            chest.add(saxophone);

            //People
            Person [] persons = {
                new Person("athelete", places[3]),
                new Person("musician", places[49]),
                new Person(null, places[29]),
                new Person("stem major", places[59]),
                new Person("humanities major", places[42]),
                new Person("administrator", places[17]),
                new Person("athelete", places[12]),
                new Person("musician", places[1]),
                new Person(null, places[33]),
                new Person("stem major", places[22]),
                new Person("humanities major", places[44]),
                new Person("administrator", places[37])
            };
            //Interaction
            Interact interaction = new Interact();
        while (gameActive) {
        // Be continuously updating location
        int x = mainPlayer.getxPlayer();
        int y = mainPlayer.getyPlayer();
        String currentStringLocation = campusMap.getStringPlaceFromCoordinates(x, y, places);
        Place currentPlaceLocation = campusMap.getPlaceFromCoordinates(x, y, places);

        
        //Initalize Scanner
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().toLowerCase();
    
        //Game Loop
            if (userInput.contains("quit")) {
                System.out.println("Thanks for playing!");
                mainPlayer.printAllPoints();
                sc.close();
                gameActive = false;
            }
       
            if (campusMap.getStringPlaceFromCoordinates(x, y, places)=="PVTA") {
                System.out.println("You have made it to the B43! You Win!");
                mainPlayer.printAllPoints();
                sc.close();
                gameActive = false;
            } 
        //Getting Locations
        if (userInput.contains("coordinates")) {
            System.out.println("You are located at X: " + x + " Y: " + y);
        }

        if (userInput.contains("where am i")) {
            if (currentStringLocation!=null) {
                System.out.println("You are at " + currentStringLocation);
            } else {
                System.out.println("Uh we cannot seem to find your location. You probably got lost. I would quit and restart the game.");
            }
        }

        
        //Movement
            if (userInput.contains("move")) {
                int tempX = mainPlayer.getxPlayer();
                int tempY = mainPlayer.getyPlayer();
                if (userInput.contains("north")) {
                    tempX--;
                    mainPlayer.setxPlayer(tempX);
                    if (mainPlayer.getCurrentLocationPlace(campusMap, mainPlayer.getxPlayer(), mainPlayer.getyPlayer(), places)==null) {
                        System.out.println("Invalid move. Try a different direction.");
                        tempX++;
                        mainPlayer.setxPlayer(tempX);
                    }
                }
                if (userInput.contains("west")) {
                    tempY--;
                    mainPlayer.setyPlayer(tempY);
                    if (mainPlayer.getCurrentLocationPlace(campusMap, mainPlayer.getxPlayer(), mainPlayer.getyPlayer(), places)==null) {
                        System.out.println("Invalid move. Try a different direction.");
                        tempY++;
                        mainPlayer.setyPlayer(tempY);
                    }
                }
                if (userInput.contains("south")) {
                    tempX++;
                    mainPlayer.setxPlayer(tempX);
                    if (mainPlayer.getCurrentLocationPlace(campusMap, mainPlayer.getxPlayer(), mainPlayer.getyPlayer(), places)==null) {
                        System.out.println("Invalid move. Try a different direction.");
                        tempX--;
                        mainPlayer.setxPlayer(tempX);
                    }
                }
                if (userInput.contains("east")) {
                    tempY++;
                    mainPlayer.setyPlayer(tempY);
                    if (mainPlayer.getCurrentLocationPlace(campusMap, mainPlayer.getxPlayer(), mainPlayer.getyPlayer(), places)==null) {
                        System.out.println("Invalid move. Try a different direction.");
                        tempY--;
                        mainPlayer.setyPlayer(tempY);
                    }
                }
                if (!(userInput.contains("north")|userInput.contains("west")|userInput.contains("south")|userInput.contains("east"))) {
                    System.out.println("You need to supply a direction! Try move north, west, south, or east!");
                } else {
                     // Set New Location
                     String newLocationString = campusMap.getStringPlaceFromCoordinates(tempX, tempY, places);
                     Place newLocationPlace = campusMap.getPlaceFromCoordinates(tempX, tempY, places);
                     mainPlayer.setCurrentLocation(newLocationString);
                     mainPlayer.setCurrentLocationPlace(newLocationPlace);
                     System.out.println("You are now located at " + newLocationString);
                     newLocationPlace.lookForChest(mainPlayer, campusMap, places);
                     newLocationPlace.lookForPeople(mainPlayer, campusMap, persons, places);
                     mainPlayer.checkForWin(places, campusMap);
                }
                
            }
        // Look for Chests (Automatically)
        //   if (mainPlayer.getCurrentLocationPlace(campusMap, x, y, places).getContainsChest()) {
        //     System.out.println("There is a chest here!");
        //   }


        Random rand = new Random();
        // Open Chest
      
            if (userInput.contains("open chest")) {
                System.out.println("Opening Chest...");
                if (currentPlaceLocation.getContainsChest()) {
                    for (int index = 0; index < 2; index++) {
                        int chestSize = chest.size();
                        int randomIndex = rand.nextInt(chestSize);
                        Item chosenItem = chest.get(randomIndex);
                        inventory.add(chosenItem);
                        chest.remove(chosenItem);
                        System.out.println("This chest has a " + chosenItem.getItemName());
                    }
                    currentPlaceLocation.setContainsChest(false);
                    System.out.println("These items have been automatically added to your inventory.");
                } else {
                    System.out.println("You cannot open a chest because there is none here or you have already emptied it!");
                }
            }
      
          
       
        if (userInput.contains("interact")) {
            //had chat GPT help me find a way to cycle through each of the npcs
            for (Person person : persons) {
                if (person.getPersonLocation()==mainPlayer.getCurrentLocationPlace(campusMap, x, y, places)) {
                    interaction.interactWithPerson(mainPlayer, person);
                    break;
                } 
            }  
            mainPlayer.checkForWin(places, campusMap);
        }      
        if (userInput.contains("use")) {
            String itemString = userInput.substring(3);
            if (!inventory.isEmpty()) {
                boolean itemFound = false;
                for (int index = 0; index < inventory.size(); index++) {
                    String hereYouGo = inventory.get(index).findItem(itemString);
                    if (hereYouGo != null) {
                        Item hereYouGoItem = inventory.get(index);
                        System.out.println("You just used " + hereYouGo);
                        hereYouGoItem.useItem(mainPlayer);
                        itemFound = true;
                        break;
                    }
                }
                if (!itemFound) {
                    System.out.println("I don't know what item you are talking about!");
                }
            } else {
                System.out.println("Your inventory is empty!");
            }
            mainPlayer.checkForWin(places, campusMap);
        }


        if (userInput.contains("inventory")) {
            if (!inventory.isEmpty()) {
                for (Item index : inventory) {
                    index.printItemName();
                }
            } else {
                System.out.println("Uhhh... there is nothing in your inventory");
            }
            
        }
        if (userInput.contains("points")) {
            mainPlayer.printAllPoints();
        }

    }
        }    }
    



