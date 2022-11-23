// display
import java.util.*;
class chk_palindrome
{
    int n , r , temp;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    void compute_display()
    {
        System.out.println(" Enter the number ");
        int n = sc.nextInt();  
        temp=n;
        while(n > 0)
        {
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
  }   
  if(temp == sum)
  {
      System.out.println(" The number is a palindrome number ");
  }
  else
  
      System.out.println(" The number is not a palindrome number ");
  }
  public static void main()
  {
  chk_palindrome ob = new chk_palindrome();
  ob.compute_display();
}
}
  
  
  
  
       
    
    