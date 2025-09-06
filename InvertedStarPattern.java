import java.util.*;
class InvertedStarPattern
  {
     public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of rows:");
      int n=sc.nextInt();
      //outer loop
    for(int i=0;i<n;i++)
      {
        //inner loop
      for(int j=1;j<=n-i;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      sc.close();
    }
  }
          
