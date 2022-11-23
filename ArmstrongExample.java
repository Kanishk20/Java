// display
import java.util.*;
class ArmstrongExample{  
public static void main()

{
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter the number to be checked ");
    int n = scan.nextInt();
    int n1 = n;
    int n2 = 0;
    int d;
    while(n>0)
    {
        d = n % 10;
        n2 = n2 + d * d * d;
        n = n/10;
    }
    if(n2 == n1)
    System.out.println(" It is an Armstrong number ");
    else
    System.out.println(" It is Not armstrong number ");
}
}
