//loops
public class primenumbersfrom1to300byloops
{
    void main(int n)
    {
        int no = 9;
        int i , j, count = 0;
        for(i = 1; i<=300;i++)
        {
            for(j = 1; j<= i ;j++)
            {
                if(i % j == 0)
                {
                    count = count + 1;
                }
            }
            if( count ==2)
            {
                System.out.println(i+"is a prime number");
            }
        count = 0;
    }
}
}