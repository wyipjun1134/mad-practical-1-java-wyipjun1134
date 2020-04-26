import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int count = base;
    for(int i = 0;i<= base;i++)
    {
      for(int n = 0; n <= count;n++)
      {
        System.out.print("*");
        
      }
      count -= 1;
      System.out.print("\n");
    }
    
  }
}
