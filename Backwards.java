/* Decompiler 5ms, total 236ms, lines 22 */
package lab6;

import java.util.Scanner;

public class Backwards {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String msg = scan.nextLine();
      System.out.print("\nThe string backwards: ");
      printBackwards(msg);
      System.out.println();
   }

   public static void printBackwards(String s) {
      for(int i = s.length() - 1; i >= 0; --i) {
         System.out.print(s.charAt(i));
      }

   }
}
