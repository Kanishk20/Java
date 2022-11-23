import java.util.*;
// display
public class Floyds_Rightangle_triangle
{
    void main()
    {
      int range , i , j , k = 1;
      Scanner scan = new Scanner(System.in);
      System.out.print(" Enter range(Upto How many lines ?): ");
      range = scan.nextInt();
      System.out.println(" Floyd's Triangle :\n ");
      for(i = 1 ; i<= range ; i++)
      {
          for(j = 1 ; j <= i ; j++ , k++)
          {
              System.out.print(k + " ");
            }
          System.out.println();
      }
    }
}
 
