/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kindb
 */
public class Container {
   
    private int amountLiquid = 0;
    private int max = 100;
    
    public Container() {
    }
    
    public int contains() {
        return amountLiquid;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.amountLiquid += amount;
        }
        
        if (this.amountLiquid > max) {
            this.amountLiquid = max;
        }
    }
    
    
    public void remove(int amount) {
        if (amount > 0) {
            this.amountLiquid -= amount;
        }
        
        if (this.amountLiquid < 0) {
            this.amountLiquid = 0;
        }
    }
    
    public String toString() {
        return this.amountLiquid + "/" + max; 
    }
    
    
    
    

}
