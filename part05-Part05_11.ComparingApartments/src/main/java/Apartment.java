
import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price1;
    private int price2;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    // Methods
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        price1 = this.princePerSquare * this.squares;
        price2 = compared.princePerSquare * compared.squares;
        
        return Math.abs((price1 - price2));
        
    }
    
    
    
    public boolean moreExpensiveThan(Apartment compared) {
        price1 = this.princePerSquare * this.squares;
        price2 = compared.princePerSquare * compared.squares;

        if (price1 > price2) {
            return true;
        }
        return false;
    }
    

}
