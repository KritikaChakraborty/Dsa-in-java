import java.util.Scanner;
public class StarPattern
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of rows:");
      int n=sc.nextInt();
      //Outer loop for rows
      for(int i=1;i<=n;i++)
        {
          //Inner loop for printing stars
          for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
          System.out.println(); //move to nextline
        }
    }
  }
