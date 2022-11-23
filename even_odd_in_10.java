import java.util.*;
class even_odd_in_10
{
    void main()
    {
        int nos [] = new int[10];
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println(" Enter 10 elements ");
        for(int i = 0 ; i<= 9; i++)
        {
            nos[i] = sc.nextInt();
            if(nos [i] % 2 == 0)
            {
                even++;
            }else
            {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
        
        