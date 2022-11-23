import java.util.*;
public class SpyNumber 
{
    
                int n,product=1,sum=0;
		int c;

		
		Scanner sc = new Scanner(System.in);
        void input()
        {
		
		System.out.print(" Enter the number :" );

		
		n=sc.nextInt();
}

		void compute_display()
		{
		while(n>0)
		{
			c=n%10;
			sum=sum+c;
			product=product*c;
			n=n/10;
		}

		
		if(sum==product)
			System.out.println("Given number is spy number");
		else
			System.out.println("Given number is not spy number");
	}
public static void main()
{
    SpyNumber ob = new SpyNumber();
    ob.input();
    ob.compute_display();
}
}
