import java.util.Scanner;
public class index{

  public static void main(String [] args)
    {
      double cp=1; //defines cost price
      double sp=1; //defines sale price
      
      System.out.println("\f"); //to clear screen
      Scanner input = new Scanner(System.in);
      
      System.out.println("1.Enter Cost Price(CP)");
      cp = input.nextInt();
      
      System.out.println("2.Enter Sale Price(SP)");
      sp = input.nextInt();
      
       if (cp>sp) {
        System.out.println("It's a loss by Rs "+ (cp-sp));
        System.out.println("Loss Percent- " + ((cp-sp)/cp*100) + "%");
      } else if (sp > cp){
        System.out.println("It's a profit by Rs "+ (sp-cp));
        System.out.println("Profit Percent- " + ((sp-cp)/cp*100) + "%"); 
      } 
        else{
            System.out.println("Both values are equal, so no profit or no loss");
        }
        
    }
}
