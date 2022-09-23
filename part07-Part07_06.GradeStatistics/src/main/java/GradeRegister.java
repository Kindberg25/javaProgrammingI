/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kindb
 */
import java.util.ArrayList;
// import java.util.Collection

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void add(int value) {
        points.add(value);
    }

    public void averagePoints() {
        double tot = 0;

        for (int i = 0; i < points.size(); i++) {
            tot = tot + points.get(i);
        }
        System.out.println("Point average (all): " + (double) tot / points.size());
    }

    public void averagePassing() {
        double tot = 0;
        int numPass = 0;

        for (int i = 0; i < points.size(); i++) {
            if ((points.get(i) >= 50) && (points.get(i) <= 100)) {
                tot += points.get(i);
                numPass += 1;
            }

        }
        System.out.println("Point average (passing): " + (double) tot / numPass);
        System.out.println("Pass percentage: " + 100 * (double) numPass / points.size());
    }

 
}
