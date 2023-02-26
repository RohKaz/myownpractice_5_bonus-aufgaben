package org.example;

public class LevelIntermediate {

    public String sayNumberWords(int number) {
        String[] Zahlen = {"Null", "Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return Zahlen[number];
    }

    public int moduloNumbersOneToHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("#");
            }
            if (i % 5 == 0) {
                System.out.print("$");
            }
            System.out.print(i + " ");
            System.out.println();

        }

        return 0;
    }
}
