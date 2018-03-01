/**
 * author : mattheusbarroos
 *
 * Transform Arabic number to Roman Numbers
 *
 * Examples:
 *    10 -> X
 *    101 -> CI
 *
 */

import java.util.Scanner;

class ArabicToRoman {
   public static void main (String [] args) {
      Scanner in = new Scanner (System.in);
      int num = 1;
      System.out.println("\n*** Convert Arabic number to Roman Number ***");
      System.out.println("Enter a negative number to exit the loop");
      while (num > 0) {
         System.out.print("Please enter an int between 1 and 3999 : ");
         num = in.nextInt();
         if (num > 0 && num < 4000) {
            System.out.println("Decimal = " + num + "\nRoman = " + ArabicToRoman (num));
         }
      }
      System.out.println("See you");
   }

   // I, V, X, L, C, D, M
   public static String ArabicToRoman (int num) {

      // Make sure both arrays have the same size, and related numbers
      String [] letters = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C",
   "CD", "D", "CM", "M"};
      int [] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

      String result = "";
      int lenghtOfNum = (int)(Math.log10(num)+1);
      int temp = 0;
      int c = 0;

      while (num != 0) {
         temp = num % 10;
         temp *= (Math.pow(10, c)); /* convert one digit at a time */
         c++;
         for (int i = 0, n = numbers.length-1; i <= n; i++) {
             if (num < numbers[i]) {

               num -= numbers[i-1];
               result += letters[i-1];
               break;
            }
            if (i == n) {
               num -= numbers[i];
               result += letters[i];
               break;
            }
         }

      }

      return result;
   }
}
