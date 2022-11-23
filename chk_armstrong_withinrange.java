// display
import java.util.*;
class chk_armstrong_withinrange
{
    int num1, num2 , i;
    int chk , rem;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    void input_compute_display()
    {
    System.out.println("Enter the starting limit ::");
    num1 = sc.nextInt();
    System.out.println("Enter the ending limit ::");
    num2 = sc.nextInt();

      for ( i = num1; i<num2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
         }
         
      }
   }
   public static void main()
   {
       chk_armstrong_withinrange ob = new chk_armstrong_withinrange();
       ob. input_compute_display();
   }
}

    