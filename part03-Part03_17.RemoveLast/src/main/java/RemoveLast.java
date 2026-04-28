
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        removeLast(null);
    }
    public static void removeLast(ArrayList<String> lista){
    if (lista.isEmpty()) {
        return;

    } else {
        int lastIndex = lista.size() - 1;
        lista.remove(lastIndex);
    }
}
}
