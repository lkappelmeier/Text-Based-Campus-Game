public class Person {

public String identity;
public Place personLocation;
public String givenItem;
    public Person(String identity, Place personLocation){
        this.identity = identity;
        this.personLocation = personLocation;
    }


    public String getIdentity() {
        return identity;
    }
    public Place getPersonLocation() {
        return personLocation;
    }

}
