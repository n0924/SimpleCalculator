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

    private void menu() {
        System.out.println("\nSelect from:");
        System.out.println("\tAdd");
    }

    private void processInput(String command) {
        if (command.equals("add")) {
            add();
        }
    }

    private void add() {

    }
}
