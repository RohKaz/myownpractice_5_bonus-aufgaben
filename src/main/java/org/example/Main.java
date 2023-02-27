package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LevelNovice nameSay = new LevelNovice();
        LevelIntermediate numberSay = new LevelIntermediate();
        LevelExpert reverseSay = new LevelExpert();


        System.out.println("Hello Roh!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Roh");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(nameSay.checkIfNumberGreaterThanZero(5));
        System.out.println(nameSay.calculateSquare(5));
        System.out.println(nameSay.nameSayer());
        System.out.println(numberSay.sayNumberWords(5));
        System.out.println(numberSay.moduloNumbersOneToHundred());
        System.out.println(reverseSay.reverseString("Eyo"));
        String reverse = "Eyo";
        System.out.println(reverse.charAt(0));
        int[] arr = {6, 2, 8, 3, 9, 6};
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




        System.out.print("Wie viele Wörter möchtest du eingeben? ");
                int n = scanner.nextInt();
                String[] words = new String[n];

                for (int i = 0; i < n; i++) {
                    System.out.print("Bitte gib das " + (i + 1) + ". Wort ein: ");
                    String word = scanner.next();
                    words[i] = word;
                    System.out.println("Eingegebenes Wort: " + word);
                }

                System.out.println("Die eingegebenen Wörter sind:");
                for (String word : words) {
                    System.out.print(word + " ");
                }
            }
        }







