
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
 
    public boolean equals(Object compared) {
    // 1. If the variables are located in the same position, they are equal
    if (this == compared) {
        return true;
    }

    // 2. If the compared object is not of type Person, the objects are not equal
    if (!(compared instanceof Person)) {
        return false;
    }

    // 3. Convert the object into a Person object
    Person comparedPerson = (Person) compared;

    // 4. Compare all object variables
    // Note: We use .equals() for String (name) and SimpleDate (birthday)
    // and == for primitive types (weight, height)
    if (this.name.equals(comparedPerson.name) &&
        this.weight == comparedPerson.weight &&
        this.height == comparedPerson.height &&
        this.birthday.equals(comparedPerson.birthday)) {
        return true;
    }

    // 5. Otherwise, the objects are not equal
    return false;
}



}
