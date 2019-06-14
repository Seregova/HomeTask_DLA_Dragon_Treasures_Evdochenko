package by.htp.aggregation.view;

import by.htp.aggregation.controller.TreasureController;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            TreasureController controller = new TreasureController();

            while (true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter command with/without value divided by comma");
                String input = sc.nextLine();

//            System.out.println(input);

                controller.doExecute(input);
            }
        }
    }

