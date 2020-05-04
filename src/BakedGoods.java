import java.util.ArrayList;

public class BakedGoods {
    String userInput;
    ArrayList<String> listOfBread = new ArrayList<>();

    String [][] breads = {{"Mulit-grain White", "10.95", "THURSDAY", "Gulten-Free", "15"},
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


            };

    protected void setListOfBread(ArrayList<String> listOfBread) {
        for (int i = 0; i < breads.length; i++) {
            for (int j = 0; j < breads[i].length; i++){
                if(breads[i][3].equals("Gulten-Free"))
                    listOfBread.add(breads[i]);
            }

        }
        this.listOfBread = listOfBread;
    }

    public ArrayList<String> getListOfBread() {
        return listOfBread;
    }




}
