import java.util.*;
class floyd_pattern_withasterix
{
   int r = 5;
   int  i , j , k = 1;
   void compute_display()
   {
       System.out.println(" Floyd's Triangle :\n ");
       for(i = 1 ; i<= 5 ; i++)
      {
          for(j = 1 ; j <= i ; j++)
          {
              System.out.print( " * ");
            }
          System.out.println();
        }
    }
    public static void main()
    {
        floyd_pattern_withasterix ob = new floyd_pattern_withasterix();
        ob.compute_display();
    }
}
   
