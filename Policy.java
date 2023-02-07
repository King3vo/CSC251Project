public class Policy
{
   private String policyNum;
   private String providerName;
   private String policyHFName;
   private String policyHLName;
   private int age;
   private String smoke;
   private boolean smokerStatus;
   private double height;
   private double weight;
   
   public Policy()
{
   policyNum = " ";
   providerName = " ";
   policyHFName = " ";
   policyHLName = " ";
   age = 0;
   smokerStatus = false;
   height = 0.00;
   weight = 0.00;
}

public void setPolicyNum(String pNum)
{
   policyNum = pNum;
}

public void setProviderName(String pName)
{
   providerName = pName;
}
public void setFirstName(String fName)
{
   policyHFName = fName;
 }

public void setLastName(String lName)
{
   policyHLName = lName;
}

public void setAge(int pAge)
{
   age = pAge;
}

public void setSmokeStat(String smokeStat)
{
   smoke = smokeStat;
   if (smoke == "smoker")
   {
      smokerStatus = true;
   } else if (smoke == "non-smoker")
   {
      smokerStatus = false;
   }
}

public void setHeight(double pHeight)
{
   height = pHeight;
}

public void setWeight(double pWeight)
{
   weight = pWeight;
}

public String getPolicyNum()
{
   return policyNum;
}

public String getProviderName()
{
   return providerName;
}
public String getFirstName()
{
   return policyHFName;
}

public String getLastName()
{
   return policyHLName;
}
public double getHeight()
{
   return height;
}

public double getAge()
{
   return age;
}

public double getWeight()
{
   return weight;
}

public String getSmoke()
{
   return smoke;
}
public double bmI(double w, double h)
{
   double bmi;
   bmi = (w * 703)/(Math.pow(h,2));
   
   return bmi;
}

public double insurancePrice(int age, boolean smokerStatus, double bmi)
{
   double bFee = 600.00;
   double aFee = 0.00;
   double price = aFee + bFee;
   
   if(age > 50)
   {
      aFee = 75.00;
   } else if( smokerStatus == true)
   {
       aFee = 100;
   } else if(bmi > 35.00)
   {
      aFee = (bmi - 35.00) * 20.00;
   }
   
   return price;
}
}





