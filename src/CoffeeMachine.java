import java.util.Scanner;

public class CoffeeMachine {
    final static int waterMl = 200;
    final static int milkMl = 50;
    final static int coffeeBeansG = 15;

    //    public static void amountOfIngredient(int cups) {
//        int water = cups * waterMl;
//        int milk = cups * milkMl;
//        int coffee = cups * coffeeBeansG;
//        System.out.printf("For %d cups of coffee you will need:%n",cups);
//        System.out.printf("%d ml ml of water%n%d ml of milk%n%d g of coffee beans",water,milk,coffee);
//    }
    public static void requiredAmountOfCoffer(int water,int milk,int coffee, int cups){
        int possibleWater;
        int possibleMilk;
        int possibleCoffee;

        if (water >= waterMl && milk >= milkMl && coffee >= coffeeBeansG) {
            possibleWater = water/waterMl;
            possibleMilk = milk/milkMl;
            possibleCoffee = coffee/coffeeBeansG;
            int min = min(possibleWater,possibleMilk,possibleCoffee);
            if (cups > min) {
               System.out.println("No, I can make only "+ min +" cup(s) of coffee");
            } else {
                int totalCups = min - cups;
                String secString = ("and even "+totalCups+" more than that");
                System.out.println(totalCups == 0 ? "Yes, I can make that amount of coffee " : "Yes, I can make that amount of coffee "+ secString);
            }

        }
        if (water == 0 && milk == 0 && coffee == 0 ) {
            if (cups >= 1) {
                System.out.println("No, I can make only 0 cup(s) of coffee");
            }
            if (cups <= 0 ) {
                System.out.println("Yes, I can make that amount of coffee");
            }
        }
    }
    public static int min(int first,int sec,int third){
        int min = first;
        if (sec < min) {
            min = sec;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }

    public static void main(String[] args) {
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterMl = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkMl = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeG = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = sc.nextInt();

        requiredAmountOfCoffer(waterMl,milkMl,coffeeG,cups);
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cups = sc.nextInt();
        //amountOfIngredient(cups);
    }
}
