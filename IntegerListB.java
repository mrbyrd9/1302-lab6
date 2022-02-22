/* Decompiler 13ms, total 86ms, lines 76 */
package lab6;

public class IntegerListB {
   int[] list;

   public IntegerListB(int size) {
      this.list = new int[size];
   }

   public void randomize() {
      for(int i = 0; i < this.list.length; ++i) {
         this.list[i] = (int)(Math.random() * 100.0D) + 1;
      }

   }

   public void print() {
      for(int i = 0; i < this.list.length; ++i) {
         System.out.println(i + ":\t" + this.list[i]);
      }

   }

   public int linearSearch(int target) {
      int location = -1;

      for(int i = 0; i < this.list.length && location == -1; ++i) {
         if (this.list[i] == target) {
            location = i;
         }
      }

      return location;
   }

   public int binarySearchRec(int target) {
      return this.binarySearchR(target, 0, this.list.length - 1);
   }

   private int binarySearchR(int target, int lo, int hi) {
      int index = 0;
      if (hi < lo) {
         index = -1;
      } else {
         int mid = (lo + hi) / 2;
         if (target == this.list[mid]) {
            index = mid;
         } else if (target < this.list[mid]) {
            index = this.binarySearchR(target, lo, mid - 1);
         } else if (target > this.list[mid]) {
            index = this.binarySearchR(target, mid + 1, hi);
         }
      }

      return index;
   }

   public void selectionSort() {
      for(int i = 0; i < this.list.length - 1; ++i) {
         int minIndex = i;

         int j;
         for(j = i + 1; j < this.list.length; ++j) {
            if (this.list[j] < this.list[minIndex]) {
               minIndex = j;
            }
         }

         j = this.list[i];
         this.list[i] = this.list[minIndex];
         this.list[minIndex] = j;
      }

   }
}
