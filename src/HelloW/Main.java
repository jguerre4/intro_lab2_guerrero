package HelloW;
import java.util.Scanner;

		public class Main {
			
		   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      
		      boolean[] chptList = new boolean[16]; 
		      int includeChpt;
		      int i, j;
		      
		      for (i = 1; i <= 15; ++i) {
		         includeChpt = scnr.nextInt(); 
		         if (includeChpt==1) {
		            chptList[i] = true;
		         }
		         else {
		            chptList[i] = false;
		         }
		      }
		      boolean anySelected = false;
		      for (i = 1; i <= 15; ++i) {
		         if (chptList[i]) {
		            anySelected = true;
		            System.out.print(i);
		            int rangeEnd = i;
		            while (rangeEnd < 15 && chptList[rangeEnd+1]) {
		               rangeEnd++;
		            }
		            if (rangeEnd > i+1) {
		               System.out.print("-" + rangeEnd);
		               i = rangeEnd;
		            }
		            System.out.print(" ");
		         }
		      }
		      
		      if (!anySelected) {
		         System.out.print("None "); 
		      }
		      
		      System.out.println();

	}

}
