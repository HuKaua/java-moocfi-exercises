import java.util.ArrayList;

public class Suitcase {
    // instace variables //
    private ArrayList <Item> suitcase;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();


    }

    public void addItem(Item item){
        
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.suitcase.add(item);
        }
    }

    public int totalWeight( ){
        int sum = 0;
        for (Item item : suitcase) {
            sum += item.getWeight();
        } return sum;
    }

    public String toString(){
        if (suitcase.isEmpty()) {
            return "no items (0 kg)";
        } else if (suitcase.size() == 1) {
            return  suitcase.size() + " item" + " (" + totalWeight() + " kg)";
        }
        return suitcase.size() + " items" +" (" + totalWeight() + " kg)";
    }

    public void printItems(){
        for (Item item : suitcase) {
            System.out.println(item);
        }
    }

    public Item heaviestItem(){
        if (this.suitcase.isEmpty()) {
            return null;
        }
        Item longesItem = this.suitcase.get(0);

        for (Item item : this.suitcase) {
            if (item.getWeight() > longesItem.getWeight()) {
                longesItem = item;
            }
        }
        return longesItem;
    } 
}
