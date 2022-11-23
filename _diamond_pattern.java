import java.util.*;
class _diamond_pattern
{
        Scanner sc = new Scanner(System.in);
        int n, i, j, space = 1;
        void input()
        {
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
    }
    void compute_display()
    {
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
public static void main()
{
    _diamond_pattern ob = new _diamond_pattern();
    ob.input();
    ob.compute_display();
}
}

    
 
