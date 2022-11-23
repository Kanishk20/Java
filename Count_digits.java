import java.util.*;
class Count_digits 
{
    int num, Count=0;
    Scanner sc = new Scanner(System.in);
    void accept_compute()
    {
	System.out.println(" Please Enter any Number: ");
        num = sc.nextInt();
	while(num > 0) 
	{
	    num = num / 10;
	    Count = Count + 1; 
        }
    }

        void display()
        {
	    System.out.println(" Number of digits in the number : " + Count);
	   }
public static void main()
{
    Count_digits ob = new Count_digits();
    ob.accept_compute();
    ob.display();
}
}
		
		
		
		
	