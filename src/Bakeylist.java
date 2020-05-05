
/*****************BakeryList
 * create an arraylist of breads
 * use default constructor to add breads to the arraylist
 * return the arraylist
 *
 */

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class BakeryList {
    private ArrayList<BakedGoods> bakeryDB = new ArrayList<>();
    // default constructor
    public BakeryList(){
            bakeryDB.add(new BakedGoods("Multi-grain whithe", 10.95, "Thursday", List.of("gluten free", "soy free"),10));
            bakeryDB.add(new BakedGoods("Banana Bread", 5.95, "THURSDAY", List.of("Has-Gulten","fat free"),15));
            bakeryDB.add(new BakedGoods("Muffins", 16.50, "THURSDAY", List.of("Gluten-Free"), 15));
            bakeryDB.add(new BakedGoods("dinner rolls", 3.00, "Friday", List.of("Gluten-Free"), 20));
            bakeryDB.add(new BakedGoods("Best Bread Box",24.00,"Friday", List.of("Has_Gulten"), 25));
            bakeryDB.add(new BakedGoods("Cinnamon Bread",10.95,"Saterday",List.of("Gulten_Free"),25));
    }

    public ArrayList<BakedGoods> getBakeryDB() {
        return bakeryDB;
    }

    public void setBakeryDB(ArrayList<BakedGoods> bakeryDB) {
        this.bakeryDB = bakeryDB;
    }
}



 /*private String [][] breads = {{"Mulit-grain White", "10.95", "THURSDAY", "Gulten-Free", "15"},
            {"Banana Bread","5.95","THURSDAY", "Has-Gulten", "15"},
            {"Muffins", "16.50","THURSDAY", "Gluten-Free", "15"},
            {"dinner rolls", "3.00", "friday", "Gluten-Free", "20"},
            {"Best Bread Box","24.00","Friday", "Has_Gulten", "25"},
            {"Cinnamon Bread","10.95","Saterday","Gulten_Free","25"},
            {"Soft Pizza Crust","6.96","Sunday","Gulten_Free","10"},
            {"Savory Rolls","3.00","Sunday","Has_Gulten","18"},
            {"Large Hamburger Buns","5.00","Saterday","Gulten_Free","20"},
            {"Spring Happy Set","34.95","Saterday","Gulten_Free","25"},
            {"Cinnamon Raisin Bread","10.95","Saterday","Gulten_Free","26"},


            };*/
