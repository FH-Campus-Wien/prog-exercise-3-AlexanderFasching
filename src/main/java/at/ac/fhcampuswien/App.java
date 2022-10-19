package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int d, int f) {
        int[] days = new int[d];
        for(int i = 1; i < d; i++) {
            days[i] = i + 1;
        }

        //System.out.print(" ");
        for(int k = 1; k < f; k++) {
            System.out.print("   ");
        }
        for(int j = 1; j <= d; j++) {
            if(j < 10) {
                System.out.print(" ");
            }
            System.out.print(j + " ");
            if((j - 1 + f) % 7 == 0) {
                System.out.println();
            }
        }
        if((days[d - 1] - 1 + f) % 7 != 0)
            System.out.println();
    }

    public static long[] lcg(long seed) {
        long[] numbers = new long[10];
        numbers[0] = (1103515245 * seed + 12345) % (long)Math.pow(2, 31);
        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = (1103515245 * numbers[i - 1] + 12345) % (long)Math.pow(2, 31);
        }
        return numbers;
    }
    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int n;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Guess number " + i + ": ");
            n = scanner.nextInt();
            if(i == 10) {
                if(n == numberToGuess)
                    System.out.println("You won wisenheimer!");
                else {
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    break;
                }
            }
            if(n < numberToGuess)
                System.out.println("The number AI picked is higher than your guess.");
            else if(n > numberToGuess)
                System.out.println("The number AI picked is lower than your guess.");
            else {
                System.out.println("You won wisenheimer!");
                break;
            }
        }
    }

    public static boolean swapArrays(int[] array1, int[] array2 ) {
        if(array1.length != array2.length)
            return false;

        for(int i = 0; i < array1.length; i++) {
            array1[i] += array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];
        }
        return true;
    }

    public static String camelCase(String s) {
        char[] c = s.toCharArray();
        String cS = "";
        for (int i = 0; i < c.length; i++) {
           if (i == 0) {
               if ('a' <= c[0] && 'z' >= c[0]) {
                   cS += (char)(c[0] - 32);
               }
               else if (c[0] >= 'A' && c[0] <= 'Z') {
                   cS += c[0];
               }
               else
                   continue;
           } else if (c[i] >= 'a' && c[i] <= 'z') {
               if (c[i - 1] == ' ') {
                   cS += (char)(c[i] - 32);
               }
               else {
                   cS += c[i];
               }
           } else if (c[i] >= 'A' && c[i] <= 'Z') {
               if (c[i - 1] != ' ') {
                   cS += (char)(c[i] + 32);
               }
               else
                   cS += c[i];
           }
        }
        return cS;
    }
    public static int randomNumberBetweenOneAndHundred() {
        Random rand = new Random();
        return rand.nextInt(99) + 1;
    }

    public static int checkDigit(int[] code) {
        int check = 0;
        for (int i = 0; i < code.length; i++) {
            check += code[i] * (i + 2);
        }
        check = 11 - (check % 11);
        switch (check) {
            case 10:
                return 0;
            case 11:
                return 5;
            default:
                return check;
        }
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        // String Builder
        //oneMonthCalendar(30, 6);
        System.out.println(camelCase("hallo oidjwo j221++   dwd"));

    }

}