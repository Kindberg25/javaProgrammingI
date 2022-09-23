
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kindb
 */
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> luggage = new ArrayList<>();
    private int totWeigh = 0;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totWeigh + suitcase.totalWeight() <= this.maximumWeight) {
            luggage.add(suitcase);
            totWeigh += suitcase.totalWeight();
        }

    }
    
    public void printItems() {
        for (int i = 0; i < luggage.size(); i++) {
            luggage.get(i).printItems();
        }
        
    }
    

    public String toString() {
        return luggage.size() + " suitcases" + " (" + totWeigh + " kg)";
    }

}
