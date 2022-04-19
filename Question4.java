import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
     int number = in.nextInt();
    
     while (number != 0){
       int stars = number;
       
       while(stars >= 0){
         if (stars != 0){
           System.out.print("*");
         }
         else{
           System.out.print("\n");
         }
         stars = stars - 1;
       }
       number = number - 1;
     }
  }
}
