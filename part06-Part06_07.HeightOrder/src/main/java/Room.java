
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
public class Room {

    private ArrayList<Person> persons;
    

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        int idx = 0;

        if (this.persons.isEmpty()) {
            return null;
        } else {
            int shortest = this.persons.get(idx).getHeight();

            for (int i = 1; i < this.persons.size(); i++) {
                if (this.persons.get(i).getHeight() < shortest) {
                    idx = i;
                    shortest = this.persons.get(i).getHeight();
                }
            }

            return this.persons.get(idx);
        }

    }
    
    public Person take() {

        if (this.persons.isEmpty()) {
            return null;
        }
        Person currShortest = shortest();
        persons.remove(shortest());
        return currShortest;

    }

    

}
