package org.example.app;

import org.example.app.services.BonusService;
import org.example.app.utils.Constants;

import java.util.Scanner;

public class App {

    static Scanner scanner;

    public static void main(String[] args) {
        getOutput(formOutput(handleData(getData())));
    }

    static double getData() {
        scanner = new Scanner(System.in);
        System.out.print("Enter sales, USD: ");
        return scanner.nextDouble();
    }

    static String handleData(double sales) {
        BonusService service = new BonusService();
        return service.getRes(sales);
    }

    static String formOutput(String res) {
        if (res.equals(Constants.SMTH_WENT_WRONG_MSG)) {
            return res;
        } else {
            return "Bonus is USD " + res;
        }
    }

    static void getOutput(String output) {
        scanner.close();
        System.out.println(output);
    }
}
