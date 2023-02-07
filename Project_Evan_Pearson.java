import java.util.Scanner;
public class Project_Evan_Pearson
{
   public static void main(String[] args)
   {
      String pNum;
      String providerName;
      String firstN;
      String lastN;
      int age;
      String smoke;
      double h;
      double w;
      
      Policy newPolicy = new Policy();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      pNum = keyboard.nextLine();
      newPolicy.setPolicyNum(pNum);
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      newPolicy.setProviderName(providerName);
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      firstN = keyboard.nextLine();
      newPolicy.setFirstName(firstN);
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      lastN = keyboard.nextLine();
      newPolicy.setLastName(lastN);
      
      System.out.print("Please enter the Policyholder’s Age: ");
      age = keyboard.nextInt();
      newPolicy.setAge(age);
      
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      smoke = keyboard.nextLine();
      newPolicy.setSmokeStat(smoke);
      
      Scanner scr = new Scanner(System.in);
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      h = scr.nextDouble();
      newPolicy.setHeight(h);
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      w = scr.nextDouble();
      newPolicy.setWeight(w);
      System.out.println("");
      System.out.println(""); 
      System.out.println("Policy Number: " + newPolicy.getPolicyNum());
      System.out.println("Provider Name: " + newPolicy.getProviderName());
      System.out.println("Policyholder’s First Name: " + newPolicy.getFirstName());
      System.out.println("Policyholder’s Last Name: " + newPolicy.getLastName());
      System.out.println("Policyholder’s Age: " + newPolicy.getAge());
      System.out.println("Policyholder’s Smoking Status: " + newPolicy.getSmoke());
      System.out.println("Policyholder’s Height: " + newPolicy.getHeight());
      System.out.println("Policyholder’s Weight: " + newPolicy.getWeight());
      // System.out.println("Policyholder’s BMI: ");
//       System.out.println("Policy Price: ");
   }
}