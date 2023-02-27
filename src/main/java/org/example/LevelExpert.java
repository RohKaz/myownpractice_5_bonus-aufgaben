package org.example;

import java.util.Arrays;

public class LevelExpert {

    public String reverseString(String string){

        String reverse = "";

        for(int i = string.length() - 1; i >= 0; i--)
        {
            reverse = reverse + string.charAt(i);
        }
        return reverse;
    }

    public static int calculateQuerSumme(int num) {
        int sum = 0;

        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    public static String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String result = "";
        result += thousands[num/1000];
        result += hundreds[(num%1000)/100];
        result += tens[(num%100)/10];
        result += ones[num%10];

        return result;
    }








}
