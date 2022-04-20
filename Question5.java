import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    //System.out.println("Enter a count:");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();
    LinkedList<Integer> list = new LinkedList<Integer>();
    
    while(input > 0){
      //System.out.print("Enter a number:");
      int num = in.nextInt();
      list.add(num);
      input = input - 1 ;
    }

    //check list of integers within
    int highestCount = 0;
    int highestNum = 0;
    for(int i : list){
      int times = 0;
      for(int u : list){
        if ( u == i){
          times ++;
        }
      }
      if (times > highestCount){
        highestCount = times;
        highestNum = i;
      }
    }
    String s = Integer.toString(highestNum);
    System.out.println(s);
  }
}
