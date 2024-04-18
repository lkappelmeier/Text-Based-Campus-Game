public class Interact {
    private int charisma;
    private int logic;
    private int money;
    private int fitness;
    private int creativity;
    private String identity;
    public Person person;
    public Interact(){
    }
    public int getCharisma() {
    System.out.println("You have " + charisma + " charisma points!");
    return charisma; 
    }
    public int getLogic() {
        System.out.println("You have " + logic + " logic points!");
        return logic;
    }
    public int getCreativity() {
        System.out.println("You have " + creativity + " creativity points!");
        return creativity;
    }
    public int getFitness() {
        System.out.println("You have " + fitness + " fitness points!");
        return fitness;
    }
    public String getIdentity() {
        return identity;
    }
    public int getMoney() {
        System.out.println("You have $" + money + "!");
        return money;
    }

    public void interactWithPerson(Person person){
        charisma++;

        if (getIdentity()=="athlete") {
            fitness = fitness++;
            System.out.println("You have interacted with an athlete! Here is another fitness point!");
        } 
        if (getIdentity()=="musician") {
            creativity++;
            System.out.println("Wow! You how found a musician! Here is another creativity point!");
        } 
        if (getIdentity()==null) {
            System.out.println("Ummmm... Weird. This person has no idenitity... probably a first year.");
        }
        if (getIdentity()=="stem major") {
            logic++;
            System.out.println("You have found a stem major! Here is another logic point!");
        }
        if (getIdentity()=="humanities major") {
            charisma++;
            System.out.println("You have found a humanities major! Here is ANOTHER charisma point!");
        }
        if (getIdentity()=="administrator") {
            System.out.println("You have found an administrator! They probably don't know you or care about you, so you remain unaffected!");
        }
    }

  public static void main(String[] args) {
    
  }

    }

    