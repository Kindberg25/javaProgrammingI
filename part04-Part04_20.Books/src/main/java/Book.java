/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kindb
 */
public class Book {
    
    private String title;
    private int pages;
    private int publYear;
    
    public Book(String title, int pages, int publYear) {
        this.title = title;
        this.pages = pages;
        this.publYear = publYear;
    }
    
    public String getName() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getPublYear() {
        return publYear;
    }
    
    /*
    
    @Override
    public String toString() {
        return this.title + this.pages + this.publYear;
    }
    
    */
}
