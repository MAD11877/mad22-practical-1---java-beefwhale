import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    
    System.out.println("Enter height:"); 
    double height = input1.nextDouble();
    System.out.println("Enter weight:"); 
    double weight = input2.nextDouble();
    
    double BMI = weight / (height * height);
    System.out.println(BMI);
  }
}
