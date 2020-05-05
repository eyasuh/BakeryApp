/*******************
 * define: name, price, expiration date, diet restriction, unit in stock
 * create constructor that takes all the fields
 * create getter methods
 * create toString method to return results
 *
 */

import com.sun.tools.javac.util.List;

public class BakedGoods {
    private String name;
    private double price;
    private String ExpDate;
    private List<String> dietRestriction;
    private int unitInStock;

    //default constructor
    public BakedGoods(){}

    public BakedGoods(String name,
                      double price,
                      String expDate,
                      List<String> dietRestriction,
                      int unitInStock) {
        this.name = name;
        this.price = price;
        ExpDate = expDate;
        this.dietRestriction = dietRestriction;
        this.unitInStock = unitInStock;
    }

    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String expDate) {
        ExpDate = expDate;
    }
    public List<String> getDietRestriction() {
        return dietRestriction;
    }

    public void setDietRestriction(List<String> dietRestriction) {
        this.dietRestriction = dietRestriction;
    }


    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }




    @Override
    public String toString() {
        return getName() + " " + getPrice() + " " + getExpDate() + " " + getUnitInStock();
    }
}


