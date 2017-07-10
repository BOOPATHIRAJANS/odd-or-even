# odd-or-even
import java.util.Scanner;

class CheckEvenOdd
{
  public static void main(String args[])
  {
    int a;
    System.out.println("Enter an Integer number:");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
