/* Decompiler 4ms, total 72ms, lines 77 */
package lab6;

import java.util.Scanner;

public class IntegerListBTest {
   static IntegerListB list = new IntegerListB(10);
   static Scanner scan;

   static {
      scan = new Scanner(System.in);
   }

   public static void main(String[] args) {
      printMenu();

      for(int choice = scan.nextInt(); choice != 0; choice = scan.nextInt()) {
         dispatch(choice);
         printMenu();
      }

   }

   public static void dispatch(int choice) {
      int loc;
      switch(choice) {
      case 0:
         System.out.println("Bye!");
         break;
      case 1:
         System.out.println("How big should the list be?");
         int size = scan.nextInt();
         list = new IntegerListB(size);
         list.randomize();
         break;
      case 2:
         list.selectionSort();
         break;
      case 3:
         System.out.print("Enter the value to look for: ");
         loc = list.linearSearch(scan.nextInt());
         if (loc != -1) {
            System.out.println("Found at location " + loc);
         } else {
            System.out.println("Not in list");
         }
         break;
      case 4:
         System.out.print("Enter the value to look for: ");
         loc = list.binarySearchRec(scan.nextInt());
         if (loc != -1) {
            System.out.println("Found at location " + loc);
         } else {
            System.out.println("Not in list");
         }
         break;
      case 5:
         list.print();
         break;
      default:
         System.out.println("Sorry, invalid choice");
      }

   }

   public static void printMenu() {
      System.out.println("\n   Menu   ");
      System.out.println("   ====");
      System.out.println("0: Quit");
      System.out.println("1: Create new list elements (** do this first!! **)");
      System.out.println("2: Sort the list using selection sort");
      System.out.println("3: Find an element in the list using linear search");
      System.out.println("4: Find an element in the list using binary search");
      System.out.println("5: Print the list");
      System.out.print("\nEnter your choice: ");
   }
}
