import java.util.*;  
public class Assignment_6_neon_num  
{  
public static void main()  
{  
int sum = 0, n;      
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: ");  

n = sc.nextInt();  
 
int square = n * n;  
 
while(square != 0)  
{  
//find the last digit of the square      
int digit = square % 10;  
//adds digits to the variable sum  
sum = sum + digit;  
//removes the last digit of the variable square  
square = square / 10;  
}  

if(n == sum)  
System.out.println(n + " is a Neon Number.");  
else  
System.out.println(n + " is not a Neon Number.");  
}  
}  