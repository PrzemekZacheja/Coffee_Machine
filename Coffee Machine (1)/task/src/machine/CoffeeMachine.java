package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    //    static final int water1Cup = 200;
//    static final int milk1Cup = 50;
//    static final int beans1Cup = 15;
    static int waterInMachine = 400;
    static int milkInMachine = 540;
    static int coffeeBeansInMachine = 120;
    static int cupsInMachine = 9;
    static int moneyInMachine = 550;

    public static void main(String[] args) {
        mainMenu();
    }

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");

    static void mainMenu() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String decision = scanner.nextLine();
            switch (decision) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    statusCoffeMachine();
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        int decisionBuyInt;
        String decision = scanner.nextLine();
        if (decision.contains("back")) {
            decisionBuyInt = 4;
        } else {
            decisionBuyInt = Integer.parseInt(decision);
        }
        switch (decisionBuyInt) {
            case 1:
                espresso();
                break;
            case 2:
                latte();
                break;
            case 3:
                cappuccino();
                break;
            case 4:
                mainMenu();
                break;
        }

    }

//    static void checkEnoughResources() {
//        if (waterInMachine >= 0 && coffeeBeansInMachine >= 0 && cupsInMachine >= 0) {
//            System.out.println("I have enough resources, making you a coffee!");
//        } else if (waterInMachine < 0) {
//            waterInMachine = 0;
//            System.out.println("Sorry, not enough water!");
//        } else if (coffeeBeansInMachine < 0) {
//            coffeeBeansInMachine = 0;
//            System.out.println("Sorry, not enough coffee beans!");
//        } else if (cupsInMachine < 0) {
//            cupsInMachine = 0;
//            System.out.println("Sorry, not enough cups!");
//        } else if (milkInMachine < 0) {
//            milkInMachine = 0;
//            System.out.println("Sorry, not enough milk!");
//        }
//    }

    static void returnEspresso() {
        waterInMachine += 250;
        coffeeBeansInMachine += 16;
        moneyInMachine -= 4;
        cupsInMachine += 1;
    }

    public static void espresso() {
        waterInMachine -= 250;
        coffeeBeansInMachine -= 16;
        moneyInMachine += 4;
        cupsInMachine -= 1;
        if (waterInMachine >= 0 && coffeeBeansInMachine >= 0 && cupsInMachine >= 0) {
            System.out.println("I have enough resources, making you a coffee!");
        } else if (waterInMachine < 0) {
            returnEspresso();
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeansInMachine < 0) {
            returnEspresso();
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cupsInMachine < 0) {
            returnEspresso();
            System.out.println("Sorry, not enough cups!");
        } else if (milkInMachine < 0) {
            returnEspresso();
            System.out.println("Sorry, not enough milk!");
        }
    }

    static void returnLatte() {
        waterInMachine += 350;
        milkInMachine += 75;
        coffeeBeansInMachine += 20;
        moneyInMachine -= 7;
        cupsInMachine += 1;
    }

    public static void latte() {
        waterInMachine -= 350;
        milkInMachine -= 75;
        coffeeBeansInMachine -= 20;
        moneyInMachine += 7;
        cupsInMachine -= 1;
        if (waterInMachine >= 0 && coffeeBeansInMachine >= 0 && cupsInMachine >= 0) {
            System.out.println("I have enough resources, making you a coffee!");
        } else if (waterInMachine < 0) {
            returnLatte();
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeansInMachine < 0) {
            returnLatte();
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cupsInMachine < 0) {
            returnLatte();
            System.out.println("Sorry, not enough cups!");
        } else if (milkInMachine < 0) {
            returnLatte();
            System.out.println("Sorry, not enough milk!");
        }
    }

    static void returnCappuccino() {
        waterInMachine += 200;
        milkInMachine += 100;
        coffeeBeansInMachine += 12;
        moneyInMachine -= 6;
        cupsInMachine += 1;
    }

    public static void cappuccino() {
        waterInMachine -= 200;
        milkInMachine -= 100;
        coffeeBeansInMachine -= 12;
        moneyInMachine += 6;
        cupsInMachine -= 1;
        if (waterInMachine >= 0 && coffeeBeansInMachine >= 0 && cupsInMachine >= 0) {
            System.out.println("I have enough resources, making you a coffee!");
        } else if (waterInMachine < 0) {
            returnCappuccino();
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeansInMachine < 0) {
            returnCappuccino();
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cupsInMachine < 0) {
            returnCappuccino();
            System.out.println("Sorry, not enough cups!");
        } else if (milkInMachine < 0) {
            returnCappuccino();
            System.out.println("Sorry, not enough milk!");
        }

    }

    static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        waterInMachine += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milkInMachine += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeBeansInMachine += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cupsInMachine += scanner.nextInt();
        scanner.nextLine();


    }

    static void take() {
        System.out.println("I gave you " + moneyInMachine);
        moneyInMachine = 0;

    }

    public static void statusCoffeMachine() {
        System.out.println("\nThe coffee machine has:\n" +
                waterInMachine + " of water\n" +
                milkInMachine + " of milk\n" +
                coffeeBeansInMachine + " of coffee beans\n" +
                cupsInMachine + " of disposable cups\n" +
                "$" + moneyInMachine + " of money ");
    }


//    public static void calculateComponent() {
//        System.out.println("Write how many cups of coffee you will need:");
//        int cupsOfCoffe = scanner.nextInt();
//        System.out.println("For " + cupsOfCoffe + " cups of coffee you will need:");
//        System.out.println(cupsOfCoffe * water1Cup + " ml of water");
//        System.out.println(cupsOfCoffe * milk1Cup + " ml of milk");
//        System.out.println(cupsOfCoffe * beans1Cup + " g of coffee beans");
//
//    }

//    static void equipmentOfMachine() {
//        System.out.println("Write how many ml of water the coffee machine has: ");
//        waterInMachine = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has: ");
//        milkInMachine = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
//        coffeeBeansInMachine = scanner.nextInt();
//
//
//    }

//    static void enoughResourcesInMachine() {
//        System.out.println("Write how many cups of coffee you will need: ");  //uzależnij od ilości możliwych filiżanek
//        int cupsOfCoffe = scanner.nextInt();
//        boolean makeCoffe = false;
//        if ((cupsOfCoffe * water1Cup) <= waterInMachine && (cupsOfCoffe * milk1Cup) <= milkInMachine && (cupsOfCoffe * beans1Cup) <= coffeeBeansInMachine) {
//            makeCoffe = true;
//        }
//        if (makeCoffe) {
//            if (cupsOfCoffe == possibleCups()) {
//                System.out.println("Yes, I can make that amount of coffee");
//            } else if (cupsOfCoffe < possibleCups()) {
//                System.out.println("Yes, I can make that amount of coffee (and even " + (possibleCups() - cupsOfCoffe) + " more than that)");
//            }
//
//        } else {
//            System.out.println("No, I can make only " + possibleCups() + "   cup(s) of coffee");
//        }
//    }

//    static int possibleCups() {
//        int[] cups = {waterInMachine / water1Cup, milkInMachine / milk1Cup, coffeeBeansInMachine / beans1Cup};
//        int maxCups = cups[0];
//        for (int cup : cups) {
//            if (cup < maxCups) {
//                maxCups = cup;
//            }
//        }
//        return maxCups;
//    }

}
