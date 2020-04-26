import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
   Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int count = 0;
    int mode = 0;
    ArrayList<Integer> mylist = new ArrayList<>();

    while (mylist.size() < num)
    {
      int newnum = in.nextInt();
      mylist.add(newnum);
      for (int i = 0; i < mylist.size(); i++)
      {
        int c = 0;

        for (int n = 0; n < mylist.size(); n++)
        {
          if (mylist.get(i) == mylist.get(n))
          {
            c += 1;
            if (c-1 > count)
            {
              count = c;
              mode = mylist.get(i);
            }
          }
        }
      }
    }
      System.out.println("\n" + mode);
  }
}
