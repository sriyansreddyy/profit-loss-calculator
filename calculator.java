import java.util.Scanner;
public class calculator{
  public static void main()
    {
      int cp=1; //defines cost price
      int sp=1; //defines sale price
      
      System.out.println("\f"); //to clear screen
      Scanner input = new Scanner(System.in);
      
      System.out.println("1.Enter Cost Price(CP)");
      cp = input.nextInt();
      
      System.out.println("2.Enter Sale Price(SP)");
      sp = input.nextInt();
      
      if(cp>sp)
        System.out.println("It's a loss by Rs "+ (cp-sp));
      else if (sp>cp)
        System.ot.println("It's a profit by Rs "+ (sp-cp));
      else
        System.out.println("Both values are same. So, no profit or no loss.");
    }
}
