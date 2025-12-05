package lab13;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      boolean[] chptList = new boolean[16]; 
      int includeChpt;
      int i, j;

      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt();
         chptList[i] = (includeChpt == 1);
      }

      boolean any = false;

      for (i = 1; i <= 15; ++i) {
         if (chptList[i]) {
            any = true;

            if (i <= 13 && chptList[i+1] && chptList[i+2]) {
               j = i + 2;
               while (j < 15 && chptList[j+1]) {
                  j++;
               }
               System.out.print(i + "-" + j + " ");
               i = j;
            }
            else {
               System.out.print(i + " ");
            }
         }
      }

      if (!any) {
         System.out.print("None ");
      }

      System.out.println();
   }
}
