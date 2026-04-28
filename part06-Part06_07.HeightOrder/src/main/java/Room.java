import java.util.ArrayList;

public class Room {

    private ArrayList<Person>persons;

    public Room(){
        this.persons = new ArrayList<>();
    
    }

    public void add(Person person){
        this.persons.add(person);

    }

    public boolean isEmpty(){
        return this.persons.isEmpty();

    } 

    public ArrayList<Person> getPersons(){
        return this.persons;
    
    }

    public Person shortest(){
        if (persons.isEmpty()) {
            return null;
        } 
        Person shortestPeep = persons.get(0);
        
        for (Person person : persons) {
            if (person.getHeight() < shortestPeep.getHeight()) {
                shortestPeep = person;
            }
        }
        return shortestPeep;
    }

    public Person take(){
        if (persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);

        return shortestPerson;
    }
}
