
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
public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight = 0;
    private int totWeight = 0;
    
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
            this.totWeight += item.getWeight();
        }
    }

    public void printItems() {
        
        for (Item it : items) {
            System.out.println(it);
        }
    }
    
    public int totalWeight() {
        return this.totWeight;
    }
    


    public String toString() {
        if (items.size() == 0) {
            return "no items" + "(" + this.totWeight + " kg)";
        }

        if (items.size() == 1) {
            return items.size() + " item " + "(" + this.totWeight + " kg)";
        }

        return items.size() + " items " + "(" + this.totWeight + " kg)";
    }
    
    public Item heaviestItem(){
        int idx = 0;
        
        if (items.isEmpty()) {
            return null;
        }   else    {
            int heaviest = this.items.get(idx).getWeight();
            
            for (int i = 1; i < this.items.size(); i++) {
                if (this.items.get(i).getWeight() > heaviest) {
                    idx = i;
                    heaviest = this.items.get(i).getWeight();
                }
            }
            return this.items.get(idx);
        }
        
    }
    
    
        
    /*
    public Suitcase heaviestItem() {
        int idx = 0;
        
        if (this.items.isEmpty()) {
            return null;
        }   else    {
            Item heaviest = this.items.get(idx);
            
        }
        return this.heaviestItem();
        
        
    }
    */

}
