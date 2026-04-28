import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase>suitcases;

    public Hold (int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    
    }

    public void addSuitcase(Suitcase suitcase){
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        } 

    }
    public int totalWeight(){
        int sum = 0;
        for (Suitcase suitcase : suitcases) {
            sum += suitcase.totalWeight();

        } return sum;
    }

   public String toString() {
    return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
}

    public void printItems(){
        for ( Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

}
