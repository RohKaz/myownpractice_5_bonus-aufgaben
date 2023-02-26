package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LevelNovice nameSay = new LevelNovice();
        System.out.println("Hello Roh!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Roh");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(nameSay.checkIfNumberGreaterThanZero(5));
        System.out.println(nameSay.calculateSquare(5));
        System.out.println(nameSay.nameSayer());

        }
    }
