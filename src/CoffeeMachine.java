import java.util.Scanner;

public class CoffeeMachine {
//    final static int waterMl = 200;
//    final static int milkMl = 50;
//    final static int coffeeBeansG = 15;


    //    public static void amountOfIngredient(int cups) {
//        int water = cups * waterMl;
//        int milk = cups * milkMl;
//        int coffee = cups * coffeeBeansG;
//        System.out.printf("For %d cups of coffee you will need:%n",cups);
//        System.out.printf("%d ml ml of water%n%d ml of milk%n%d g of coffee beans",water,milk,coffee);
//    }
//    public static void requiredAmountOfCoffer(int water,int milk,int coffee, int cups){
//        int possibleWater;
//        int possibleMilk;
//        int possibleCoffee;
//
//        if (water >= waterMl && milk >= milkMl && coffee >= coffeeBeansG) {
//            possibleWater = water/waterMl;
//            possibleMilk = milk/milkMl;
//            possibleCoffee = coffee/coffeeBeansG;
//            int min = min(possibleWater,possibleMilk,possibleCoffee);
//            if (cups > min) {
//               System.out.println("No, I can make only "+ min +" cup(s) of coffee");
//            } else {
//                int totalCups = min - cups;
//                String secString = ("and even "+totalCups+" more than that");
//                System.out.println(totalCups == 0 ? "Yes, I can make that amount of coffee " : "Yes, I can make that amount of coffee "+ secString);
//            }
//
//        }
//        if (water == 0 && milk == 0 && coffee == 0 ) {
//            if (cups >= 1) {
//                System.out.println("No, I can make only 0 cup(s) of coffee");
//            }
//            if (cups <= 0 ) {
//                System.out.println("Yes, I can make that amount of coffee");
//            }
//        }
//    }
//    public static int min(int first,int sec,int third){
//        int min = first;
//        if (sec < min) {
//            min = sec;
//        }
//        if (third < min) {
//            min = third;
//        }
//        return min;
//    }

    static int money = 550;
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;

    public static void ingredients() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$"+money + " of money");
        System.out.println();
    }

    public static void action() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = sc.nextLine();
            while (action.isEmpty()) {
                action = sc.nextLine();
            }

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: back - to main menu:");
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else  if (coffeeBeans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (money < 4) {
                                System.out.println("Sorry, not enough money!");
                            } else {
                                water = water - 250;
                                coffeeBeans = coffeeBeans - 16;
                                money = money + 4;
                                disposableCups = disposableCups - 1;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else  if (coffeeBeans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (money < 7) {
                                System.out.println("Sorry, not enough money!");
                            } else {
                                water = water - 350;
                                milk = milk - 75;
                                coffeeBeans = coffeeBeans - 20;
                                money = money + 7;
                                disposableCups = disposableCups - 1;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else  if (coffeeBeans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                            } else if (money < 6) {
                                System.out.println("Sorry, not enough money!");
                            } else {
                                water = water - 200;
                                milk = milk - 100;
                                coffeeBeans = coffeeBeans - 12;
                                money = money + 6;
                                disposableCups = disposableCups - 1;
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int water1 = sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milk1 = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int coffeeBeans1 = sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int disposableCups1 = sc.nextInt();
                    water += water1;
                    milk += milk1;
                    coffeeBeans += coffeeBeans1;
                    disposableCups += disposableCups1;
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + money +"\n");
                    money -= money;
                    break;
                case "remaining":
                    ingredients();
                    break;
                case "exit":
                    return;
            }

        }
    }


    public static void main(String[] args) {
        action();
    }


//        System.out.println("Write how many ml of water the coffee machine has:");
//        int waterMl = sc.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int milkMl = sc.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int coffeeG = sc.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        int cups = sc.nextInt();
//
//        requiredAmountOfCoffer(waterMl,milkMl,coffeeG,cups);
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cups = sc.nextInt();
    //amountOfIngredient(cups);

}
