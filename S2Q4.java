public class S2Q4 {
 public static void main(String[] args) {

  // Figure 1 (while loop square)
  System.out.println("Using while loop");

  int row = 1;

  while (row <= 5) {
   int col = 1;
   while (col <= 5) {
    System.out.print("* ");
    col++;
   }
   System.out.println();
   row++;
  }

  // Figure 2 (for loop triangle)
  System.out.println("\nUsing for loop");
  int rows = 5;
  for (int i=1; i<= rows; i++) {

   for (int s = rows; s > i; s--) {
    System.out.print(" ");
   }

   for (int j = 1; j <= i; j++) {
    System.out.print("* ");
   }
   System.out.println();
  }
 }
}
