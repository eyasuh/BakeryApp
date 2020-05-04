import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brookley's Better Bakery App! \n" +
                "We contain peanut, gluten, soy and dairy in our products. ");
        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: \n" +
                "To see a list of all our foods, please type \"all\".");

        Scanner input = new Scanner(System.in);
        String userResponse = input.nextLine();



    }
}
