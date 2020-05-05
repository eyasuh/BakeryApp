/****************************Bakery App***************
 *
 * input: user response
 *        bakerylist arraylist
 *        BakedGoods objects
 * output: prompt user
 *         list of BakedGoods
 * process: store user response
 *          create BakeryList object
 *          run enhanced for loop of BakedGoods objects in BakeryList
 *              if user  response is not in diet restriction list
 *                  print out the list
 *          end for loop
 *
 */

import java.util.Scanner;

public class BakeryApp {


    public static void main(String[] args) {
        System.out.println("Welcome to the Brookley's Better Bakery App! \n" +
                "We contain peanut, gluten, soy and dairy in our products. ");
        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: \n" +
                "To see a list of all our foods, please type \"all\".");

        Scanner input = new Scanner(System.in);
        String userResponse = input.nextLine();

        //System.out.println(new BakedGoods("Gulten-Free").toString());

        BakeryList db = new BakeryList();

        for(BakedGoods bread: db.getBakeryDB())
            if (!bread.getDietRestriction().contains(userResponse))
                    System.out.println(bread.toString());




    }
}

