import java.util.Scanner;

public class question2 
{
 public static void main(String[] args)
 {
   
  int ymax;
  int xmax;
  
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Please enter the x-value for the box");
  xmax = keyboard.nextInt();
  System.out.println("Please enter the y-value for the box");
  ymax = keyboard.nextInt();
 
  for(int j = 0; j<=ymax; j++)
  {
   for(int i = 0 ; i<=xmax; i++)
   {
    if(i == 0 && j == 0)
    {
      System.out.print("^");
    }
    else if((i == 0) && (j == ymax))
    {
      System.out.print("+");
    }
    else if((i == 0) && (j != ymax))
    {
      System.out.print("|");
    }
    else if(j == ymax)
    {
      System.out.print("-");
    }
    else if(i == xmax+1)
    {
      System.out.print(">");
    }
   }
   System.out.println("");
  }
  /*
      for (begin @ 0; ymax entered by user; increase by 1)
      {
      for (begin @ 0; xmax entered by user; increase by 1 
      {
      if(ymax = 0 & xmax = 9)
      {(System.out.print("+")}
      else if (ymax ==0 & xmax ==0)
      {System.out.println("^")
      
      else if (xmax == 4 & ymax ==9)
      {System.outprintln(">")}
      
      else{System.out.print("("+i+","+j+") "); }
       
      }
      System.out.print("\n"); 
   */
 }
}