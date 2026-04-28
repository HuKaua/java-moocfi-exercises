
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    


public String toString(){
    
    String printOutput = "The collection " + this.name;
    String elementsAsString = "";
    for (String element : this.elements) {
        elementsAsString += element + "\n";
     }

    if (this.elements.isEmpty()) {
        return printOutput + " is empty.";
    }if (this.elements.size()==1) {
        return printOutput + " has " + this.elements.size() + " element:\n" + elementsAsString.trim();
    } else {   
         return printOutput + " has " + this.elements.size() + " elements:\n" + elementsAsString.trim();
    }
}
}

