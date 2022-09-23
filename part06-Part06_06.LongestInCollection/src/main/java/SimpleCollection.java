
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

    public String longest() {
        /*
        for (String el: elements) {
            System.out.println(el.length());
        }
         */
        int idx = 0;

        if (this.elements.isEmpty()) {
            return null;
        } else {
            int elemLength = this.elements.get(idx).length();

            for (int i = 1; i < this.elements.size(); i++) {
                if (this.elements.get(i).length() > elemLength) {
                    idx = i;
                    elemLength = this.elements.get(i).length();
                }
            }

            return this.elements.get(idx);
        }

    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

}
