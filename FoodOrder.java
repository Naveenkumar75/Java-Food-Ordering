import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class FoodOrder {

    // first lets declare our variables for prices of food items
    int frenchFries = 100;
    int burger = 120;
    int pastry = 100;
    int pizza = 200;
    int coldCoffee = 100;
    int coldrink = 80;
    int icedtea = 80;
    int ch;
    int quantity;
    static int total;
    String again;

    Scanner sc = new Scanner(System.in);

    // lets create a method for displaing our food menu
    // I've tried to make it look beautiful :)

    public void displayMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           1.French Fries          100/-");
        System.out.println("           2.Burger                120/-");
        System.out.println("           3.Pastry                100/-");
        System.out.println("           4.Cold Drinks           80/- ");
        System.out.println("           5.Cold Coffee           100/-");
        System.out.println("           6.Pizza                 200/-");
        System.out.println("           7.Iced Tea              80/- ");
        System.out.println("           8.Exit                       ");
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }// Our Food Menu is ready

    // let's create a method to oreder a food item
    // I'am using Swich case for this

    //we need a method to generate bill
    public void generateBill()
    {
        System.out.println();
        System.out.println("***************** Thankyou for ordering ******************");
        System.out.println("****************Your Bill is : " +total+"*****************");
    }

    public void order() {
        while (true) {
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:// French Fries
                    System.out.println("You have Selected French Fries");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * frenchFries;

                    break;

                case 2:// Burger
                    System.out.println("You have Selected  Burger");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * burger;

                    break;

                case 3:// Pastry
                    System.out.println("You have Selected Pastry");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * pastry;

                    break;
                case 4:// Cold Drinks
                    System.out.println("You have Selected Cold Drinks");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * coldrink;

                    break;
                case 5:// Cold Coffee
                    System.out.println("You have Selected Cold Coffee");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * coldCoffee;

                    break;

                case 6:// Pizza
                    System.out.println("You have Selected Pizza");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * pizza;

                    break;

                case 7:// Iced Tea
                    System.out.println("You have Selected Iced Tea");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * icedtea;

                    break;

                case 8:// exit
                    System.exit(1);
                    break;

                default:
                    break;
            }
            System.out.println();
            System.out.print("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            {order();}
            else if(again.equalsIgnoreCase("N"))
            {generateBill();
            System.exit(1);}
            else{System.out.println("Invalid Choice");}
        }
    }
}
