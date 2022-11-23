// display
import java.util.*;
public class reversingbywhileloops
{
   void main()
   {
       int reverse = 0;
       int d;
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       while(n != 0)
       {
           d = n % 10;
           reverse = (reverse * 10) + d;
           n = n/10;
       }
       System.out.println(reverse);
    }
}
 