package org.example;

import java.util.Scanner;

public class LevelNovice {


    public boolean checkIfNumberGreaterThanZero(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateSquare(int number) {
        return number * number;
    }

    public String nameSayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();

        return "Hallo " + name;

    }
    }





