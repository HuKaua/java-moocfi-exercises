import java.util.ArrayList;

public class Stack {
    private ArrayList <String> items;

    public Stack(){
        this.items = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (items.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value){
        items.add(value);
    }

    public ArrayList<String> values(){
        return this.items;
    }

    public String take(){
        int lastIndex = this.items.size() -1;

        String takenValue = this.items.remove(lastIndex);

        return takenValue;
    }


}
