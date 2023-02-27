package ui;

import java.util.Scanner;

public class SimpleCalculatorUI {
    private Scanner input;

    public SimpleCalculatorUI() {
        runApp();
    }

    private void runApp(){
        boolean keepGoing = true;
        input = new Scanner(System.in);

        while (keepGoing) {
            menu();
            String command = input.next().toLowerCase();

            if (command.equals("quit")) {
                keepGoing = false;
            } else {
                processInput(command);
            }

        }
    }

    //EFFECT: menu screen
    private void menu() {
        System.out.println("\nSelect from:");
        System.out.println("\tAdd");
    }

    //EFFECT: Process user input
    private void processInput(String command) {
        if (command.equals("add")) {
            add();
        }
    }

    private void add() {
        System.out.println("\n Input the first number");
        String firstInput = input.next().toLowerCase();
        int first = Integer.parseInt(firstInput);

        System.out.println("\n Input the second number");
        String secondInput = input.next().toLowerCase();
        int second = Integer.parseInt(secondInput);

        int sum = first + second;
        System.out.println(sum);
    }
}
