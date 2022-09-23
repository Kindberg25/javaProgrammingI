
public class HealthStation {
    private int numWeighings;
    
    public HealthStation() {
        this.numWeighings = 0;
    }


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        numWeighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        
        /*
        int currentWeight = person.getWeight();
        currentWeight++;
        
        person.setWeight(currentWeight);
        */
        
        person.setWeight(person.getWeight() + 1);
        
        
    }
    
    public int weighings() {
        return numWeighings;
        
        
        
    }
    
    
    
}
