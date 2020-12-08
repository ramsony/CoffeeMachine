import java.util.Scanner;

public class CoffeeMachine {
    final static int waterMl = 200;
    final static int milkMl = 50;
    final static int coffeeBeansG = 15;

    public static void amountOfIngredient(int cups) {
        int water = cups * waterMl;
        int milk = cups * milkMl;
        int coffee = cups * coffeeBeansG;
        System.out.printf("For %d cups of coffee you will need:%n",cups);
        System.out.printf("%d ml ml of water%n%d ml of milk%n%d g of coffee beans",water,milk,coffee);
    }
    public static void main(String[]args) {
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = sc.nextInt();
        amountOfIngredient(cups);
    }
}
